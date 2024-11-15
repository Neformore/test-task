CREATE TABLE users
(
    id       BIGSERIAL PRIMARY KEY,
    email    VARCHAR(255) UNIQUE NOT NULL,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255)        NOT NULL,
    role     VARCHAR(10)         NOT NULL CHECK (role IN ('ROLE_USER', 'ROLE_ADMIN'))
);

CREATE TABLE tasks
(
    id          BIGSERIAL PRIMARY KEY,
    title       VARCHAR(255) NOT NULL,
    description TEXT         NOT NULL,
    status      VARCHAR(20)  NOT NULL CHECK (status IN ('PENDING', 'IN_PROCESS', 'COMPLETED')),
    priority    VARCHAR(10)  NOT NULL CHECK (priority IN ('HIGH', 'MEDIUM', 'LOW')),
    author_id   BIGINT REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE comments
(
    id      BIGSERIAL PRIMARY KEY,
    task_id BIGINT REFERENCES tasks (id) ON DELETE CASCADE,
    user_id BIGINT REFERENCES users (id) ON DELETE CASCADE,
    text    TEXT NOT NULL
);

CREATE TABLE task_assignees
(
    task_id BIGINT REFERENCES tasks (id) ON DELETE CASCADE,
    user_id BIGINT REFERENCES users (id) ON DELETE CASCADE,
    PRIMARY KEY (task_id, user_id)
);
