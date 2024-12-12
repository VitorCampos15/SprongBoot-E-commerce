CREATE TABLE produto (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         nome VARCHAR(100) NOT NULL,
                         descricao TEXT,
                         preco DECIMAL(10, 2) NOT NULL,
                         estoque INT NOT NULL
);
