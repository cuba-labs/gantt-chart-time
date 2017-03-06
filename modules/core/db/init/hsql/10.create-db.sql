-- begin DEMO_TASK_SPAN
create table DEMO_TASK_SPAN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CATEGORY varchar(255) not null,
    --
    primary key (ID)
)^
-- end DEMO_TASK_SPAN
-- begin DEMO_SEGMENT
create table DEMO_SEGMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    START_ integer,
    DURATION integer,
    COLOR varchar(255),
    TASK_ varchar(255),
    INDEX_ integer,
    TASK_SPAN_ID varchar(36),
    --
    primary key (ID)
)^
-- end DEMO_SEGMENT
