package ru.job4j.pojo;

/**
 * Метод delete принимает индекс ячейки, которую необходимо удалить и все ячейки,
 * стоящие справа от удаляемой необходимо переместить на одну ячейку влево.
 * 2023-04-17
 */
public class ShopDrop {
    public static Product[] delete1(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

        public static Product[] delete2(Product[] products, int index) {
        while (index < products.length - 1 && products[index] != null) {
            products[index] = products[index + 1];
            index++;
        }
        products[products.length - 1] = null;
        return products;
    }

    public static Product[] delete3(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            if (products[i] != null) {
                products[i] = products[i + 1];
            } else {
                return products;
            }
        }
        products[products.length - 1] = null;
        return products;
    }
}