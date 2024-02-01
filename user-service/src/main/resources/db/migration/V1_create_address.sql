CREATE TABLE address (
                         address_id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
                         user_id INT(11),
                         full_address VARCHAR(255),
                         postal_code VARCHAR(255),
                         city VARCHAR(255),
                         created_at TIMESTAMP DEFAULT LOCALTIMESTAMP NOT NULL,
                         updated_at TIMESTAMP
);
