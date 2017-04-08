DROP DATABASE IF EXISTS Forum;
CREATE DATABASE Forum CHARACTER SET utf8 COLLATE utf8_bin;

USE Forum;

-- ---
-- Tables definition
-- ---

DROP TABLE IF EXISTS Category;
CREATE TABLE Category (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  `description` TEXT DEFAULT NULL,
  `user` INTEGER NOT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS Theme;
CREATE TABLE Theme (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  `description` TEXT DEFAULT NULL,
  `category` INTEGER NOT NULL,
  user INTEGER NOT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS Post;
CREATE TABLE Post (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `header` VARCHAR(255) NULL,
  `text` TEXT NOT NULL,
  `parent` INTEGER DEFAULT NULL,
  `theme` INTEGER NOT NULL,
  `user` INTEGER NOT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS User;
CREATE TABLE User (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(40) NOT NULL,
  `email` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`id`)
);

-- ---
-- Foreign Keys
-- ---

ALTER TABLE Category ADD FOREIGN KEY (user) REFERENCES User (`id`);
ALTER TABLE Theme ADD FOREIGN KEY (user) REFERENCES User (`id`);
ALTER TABLE Theme ADD FOREIGN KEY (category) REFERENCES Category (`id`);
ALTER TABLE Post ADD FOREIGN KEY (theme) REFERENCES Theme (`id`);
ALTER TABLE Post ADD FOREIGN KEY (user) REFERENCES User (`id`);
ALTER TABLE Post ADD FOREIGN KEY (parent) REFERENCES Post (`id`);