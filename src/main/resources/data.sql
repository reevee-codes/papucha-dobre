CREATE TABLE IF NOT EXISTS papugi (
    id INT8 NOT NULL,
    name VARCHAR(255),
    color VARCHAR(255),
    PRIMARY KEY (id)
);

INSERT INTO papugi (id, name, color) VALUES (1, 'Sebusia', 'blue');
INSERT INTO papugi (id, name, color) VALUES (2, 'Marcel', 'green');
