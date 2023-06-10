#!/bin/sh

git filter-branch --env-filter 'if [ "$GIT_AUTHOR_EMAIL" = "geotod@mail.ru" ]; then
GIT_AUTHOR_EMAIL=aa11@mail.ru;
GIT_AUTHOR_NAME="Serge-In"
GIT_COMMITTER_EMAIL=$GIT_AUTHOR_EMAIL;
GIT_COMMITTER_NAME="$GIT_AUTHOR_NAME"; fi' -- --all'