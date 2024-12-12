CREATE TABLE pedido (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        usuario_id BIGINT NOT NULL,
                        data_pedido TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        valor_total DECIMAL(10, 2) DEFAULT 0.00,
                        FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);
