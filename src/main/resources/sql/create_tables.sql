-- drop table food_image;
-- drop table cook_instruction;
-- drop table raw_product;
-- drop table recipe;
-- drop table food;
-- drop table bag;
-- drop table contacts;
-- drop table partner;
-- drop table food_order;

CREATE TABLE IF NOT EXISTS food_image (
    id uuid UNIQUE NOT NULL,
    title varchar(255) NOT NULL,
    PRIMARY KEY (id)
    );

CREATE TABLE IF NOT EXISTS cook_instruction (
    id uuid UNIQUE NOT NULL,
    title varchar(255) NOT NULL,
    step int NOT NULL,
    description varchar(255) NOT NULL,
    status VARCHAR(10) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS raw_product (
    id uuid UNIQUE NOT NULL,
    title varchar(255) NOT NULL,
    grams BIGINT,
    calories BIGINT,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS recipe (
    id uuid UNIQUE NOT NULL,
    title varchar(255) NOT NULL,
    description varchar(255) NOT NULL,
    cookTime varchar(255),
    calorie varchar(255),
    raw_product_id uuid,
    cook_instruction_id uuid,
    food_image_id uuid,
    PRIMARY KEY (id),
    FOREIGN KEY (cook_instruction_id) REFERENCES cook_instruction (id),
    FOREIGN KEY (food_image_id) REFERENCES food_image (id),
    FOREIGN KEY (raw_product_id) REFERENCES raw_product (id)
);

CREATE TABLE IF NOT EXISTS food (
    id uuid UNIQUE NOT NULL,
    title varchar(255) NOT NULL,
    price BIGINT NOT NULL,
    recipe_id uuid,
    PRIMARY KEY (id),
    FOREIGN KEY (recipe_id) REFERENCES recipe (id)
);

CREATE TABLE IF NOT EXISTS bag (
    id uuid UNIQUE NOT NULL,
    food_id uuid,
    raw_product_id uuid,
    PRIMARY KEY (id),
    FOREIGN KEY (food_id) REFERENCES food (id),
    FOREIGN KEY (raw_product_id) REFERENCES raw_product (id)
);

CREATE TABLE IF NOT EXISTS contacts(
    id uuid UNIQUE NOT NULL,
    description varchar(255),
    country varchar(255),
    region varchar(255),
    city varchar(255),
    district varchar(255),
    street varchar(255),
    -- House
    hous_number varchar(255),
    hous_floor varchar(255),
    hous_apartment varchar(255),
    -- Address Location
    latitude BIGINT,
    longitude BIGINT,
    -- Phone Number
    countryCode varchar(10),
    operatorCode varchar(10),
    subscriberNumber varchar(20),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS partner(
    id uuid UNIQUE NOT NULL,
    firstname varchar(255),
    surname varchar(255),
    patronymic varchar(255),
    partner_type varchar(10),
    contacts_id uuid,
    bag_id uuid,
    PRIMARY KEY (id),
    FOREIGN KEY (contacts_id) REFERENCES contacts (id),
    FOREIGN KEY (bag_id) REFERENCES bag (id)
);

CREATE TABLE IF NOT EXISTS food_order (
    id uuid UNIQUE NOT NULL,
    full_price BIGINT NOT NULL,
    partner_id uuid NOT NULL,
    cook_id uuid NOT NULL,
    food_id uuid NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (partner_id) REFERENCES partner (id),
    FOREIGN KEY (cook_id) REFERENCES cook (id),
    FOREIGN KEY (food_id) REFERENCES food (id)
);