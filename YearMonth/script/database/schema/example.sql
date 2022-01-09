create table example
(
    id   bigint not null
        constraint example_pk
            primary key,
    time date   not null
);