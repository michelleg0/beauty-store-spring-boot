create table if not exists product
(
    id         int auto_increment
        primary key,
    product_name varchar(100) not null,
    sku varchar(100) not null,
    price      varchar(50)  not null,
    discount varchar(100) not null,
);

