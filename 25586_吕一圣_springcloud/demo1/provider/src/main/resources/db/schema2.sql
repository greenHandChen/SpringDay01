CREATE TABLE orders(
    id INTEGER primary key,
    user_id INTEGER,
    createtime date
--     foreign  key (user_id) references user_info(id) ON delete cascade on update cascade
);