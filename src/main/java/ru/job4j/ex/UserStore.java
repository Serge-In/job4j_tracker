package ru.job4j.ex;

/**
 * 2023-12-08
 * 0.5. Иерархия исключений и множественный catch. [#219368]
 * 1. Создайте класс ru.job4j.ex.UserNotFoundException наследника от Exception.
 * 2. Создайте класс ru.job4j.ex.UserInvalidException наследника от UserNotFoundException.
 * 3. Создайте класс ru.job4j.ex.User и хранилище ru.job4j.ex.UserStore.
 * 4. Вам необходимо реализовать метод findUser, validate и main.
 * findUser - если пользователя не нашли в списке, то кинуть исключение UserNotFoundException.
 * validate - если пользователь не валидный или если имя пользователя состоит из менее трех символов, то кинуть исключение UserInvalidException
 * main - поправить код за счет использования try-catch с множественным блоком catch.
 * В блоке catch(UserNotFoundException) - должно быть выведено на консоль сообщение, что пользователя не найдено.
 * В блоке  catch(UserInvalidException) - должно быть выведено на консоль сообщение, что пользователь не валидный.
 *
 */

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                return user;
            }
        }
        throw new UserNotFoundException("UserNotFound");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() ||  user.getUsername().length() < 3) {
            throw new UserInvalidException("User isn't valid");
        }
        return true;
    }

public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ein) {
            ein.printStackTrace();
        } catch (UserNotFoundException enf) {
            enf.printStackTrace();
          }
        }
}