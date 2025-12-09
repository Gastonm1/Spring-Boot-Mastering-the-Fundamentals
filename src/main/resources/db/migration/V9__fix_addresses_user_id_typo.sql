ALTER TABLE addresses
    ADD CONSTRAINT addresses_users_id_fk
        FOREIGN KEY (user_id) REFERENCES users (id);