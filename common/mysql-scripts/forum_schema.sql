DROP DATABASE IF EXISTS Forum;
CREATE DATABASE Forum CHARACTER SET utf8 COLLATE utf8_bin;

USE Forum;

-- ---
-- Tables definition
-- ---

DROP TABLE IF EXISTS `Categories`;
CREATE TABLE `Categories` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  `description` TEXT DEFAULT NULL,
  `user` INTEGER NOT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `Themes`;
CREATE TABLE `Themes` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  `description` TEXT DEFAULT NULL,
  `category` INTEGER NOT NULL,
  user INTEGER NOT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `Posts`;
CREATE TABLE `Posts` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `header` VARCHAR(255) NULL,
  `text` TEXT NOT NULL,
  `comment_to` INTEGER DEFAULT NULL,
  `theme` INTEGER NOT NULL,
  `user` INTEGER NOT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `Users`;
CREATE TABLE `Users` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`)
);

-- ---
-- Foreign Keys
-- ---

ALTER TABLE `Categories` ADD FOREIGN KEY (user) REFERENCES `Users` (`id`);
ALTER TABLE `Themes` ADD FOREIGN KEY (user) REFERENCES `Users` (`id`);
ALTER TABLE `Themes` ADD FOREIGN KEY (category) REFERENCES `Categories` (`id`);
ALTER TABLE `Posts` ADD FOREIGN KEY (theme) REFERENCES `Themes` (`id`);
ALTER TABLE `Posts` ADD FOREIGN KEY (user) REFERENCES `Users` (`id`);
ALTER TABLE `Posts` ADD FOREIGN KEY (comment_to) REFERENCES `Posts` (`id`);