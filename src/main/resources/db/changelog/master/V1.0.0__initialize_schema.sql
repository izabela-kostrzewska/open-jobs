CREATE TABLE user
(
    id       BIGINT PRIMARY KEY AUTO_INCREMENT,
    email    VARCHAR(120) NOT NULL UNIQUE,
    password VARCHAR(45)  NOT NULL
);

CREATE TABLE company
(
    id          BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id     BIGINT       NOT NULL,
    name        VARCHAR(255) NOT NULL,
    address     VARCHAR(255) NOT NULL,
    description VARCHAR(510),
    logo_image  VARCHAR(255),
    FOREIGN KEY (user_id)
        REFERENCES user (id)
        ON DELETE CASCADE
);

CREATE TABLE contract
(
    id         BIGINT PRIMARY KEY AUTO_INCREMENT,
    type       VARCHAR(255) NOT NULL,
    min_salary INT,
    max_salary INT
);

CREATE TABLE offer
(
    id          BIGINT PRIMARY KEY AUTO_INCREMENT,
    company_id  BIGINT       NOT NULL,
    contract_id BIGINT       NOT NULL,
    position    VARCHAR(255) NOT NULL,
    description VARCHAR(510) NOT NULL,
    FOREIGN KEY (company_id)
        REFERENCES company (id)
        ON DELETE CASCADE,
    FOREIGN KEY (contract_id)
        REFERENCES contract (id)
        ON DELETE CASCADE
);

CREATE TABLE technology
(
    id   BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255)
);

CREATE TABLE requirement
(
    id            BIGINT PRIMARY KEY AUTO_INCREMENT,
    offer_id      BIGINT NOT NULL,
    technology_id BIGINT NOT NULL,
    level         INT,
    FOREIGN KEY (offer_id)
        REFERENCES offer (id)
        ON DELETE CASCADE,
    FOREIGN KEY (technology_id)
        REFERENCES technology (id)
);
