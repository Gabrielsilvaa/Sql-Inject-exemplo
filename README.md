# Exemplos de Endpoints: SQL Injection

## 1. Endpoint Vulnerável:

- **Pensamento de como deve funcionar**:
    - URL: [http://localhost:8080/vulneravel/buscar?username=Ana%20Oliveira](http://localhost:8080/vulneravel/buscar?username=Ana%20Oliveira)

- **Vulnerabilidade pipocando**:
    - URL: [http://localhost:8080/vulneravel/buscar?username=Ana%20Oliveira%27%20OR%20%271%27=%271](http://localhost:8080/vulneravel/buscar?username=Ana%20Oliveira%27%20OR%20%271%27=%271)

## 2. Endpoint Seguro com PreparedStatement:
- URL: [http://localhost:8080/seguro/buscar?username=Ana%20Oliveira](http://localhost:8080/seguro/buscar?username=Ana%20Oliveira)

**Seguro**: Previne SQL Injection.

## 3. Endpoint com JPA:
- URL: [http://localhost:8080/jpa/buscar?username=Ana%20Oliveira](http://localhost:8080/jpa/buscar?username=Ana%20Oliveira)

**Seguro**: Usa o Spring Data JPA para consultas seguras.
