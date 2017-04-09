CREATE TABLE COMPRA
(
	ID NUMBER NOT NULL,
	ID_PERSONA NUMBER NOT NULL,
	COSTO NUMBER NOT NULL,
	ID_SILLA NUMBER NOT NULL,
	CONSTRAINT PK_COMPRA PRIMARY KEY(ID),
	CONSTRAINT FK_PERSONA FOREIGN KEY(ID_PERSONA) REFERENCS PERSONA(ID),
	CONSTRAINT FK_SILLA FOREIGN KEY(ID_SILLA) REFERENCES SILLA(ID)
);

INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (1,'95','650','79');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (2,'03','822','32');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (3,'00','857','47');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (4,'40','720','23');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (5,'28','913','90');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (6,'85','101','21');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (7,'80','545','54');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (8,'15','032','57');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (9,'30','042','92');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (10,'73','740','78');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (11,'65','913','01');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (12,'45','289','28');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (13,'09','909','60');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (14,'53','267','73');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (15,'86','078','33');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (16,'85','269','91');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (17,'44','862','60');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (18,'54','741','00');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (19,'06','989','61');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (20,'36','698','41');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (21,'62','890','69');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (22,'31','720','07');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (23,'75','510','88');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (24,'16','334','42');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (25,'59','993','35');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (26,'80','093','61');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (27,'59','223','78');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (28,'73','343','39');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (29,'79','887','77');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (30,'74','732','16');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (31,'28','064','68');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (32,'47','307','40');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (33,'71','727','66');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (34,'18','793','99');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (35,'29','311','24');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (36,'49','835','81');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (37,'99','066','92');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (38,'83','767','98');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (39,'41','218','70');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (40,'52','471','01');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (41,'35','601','45');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (42,'44','990','97');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (43,'06','689','36');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (44,'42','422','22');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (45,'29','240','17');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (46,'82','557','04');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (47,'47','328','06');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (48,'32','928','11');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (49,'19','392','96');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (50,'22','121','18');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (51,'73','239','18');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (52,'91','283','58');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (53,'27','993','38');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (54,'73','956','23');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (55,'85','704','12');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (56,'43','880','90');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (57,'05','709','26');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (58,'93','654','19');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (59,'04','650','20');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (60,'27','701','16');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (61,'43','158','75');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (62,'86','091','33');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (63,'10','167','85');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (64,'14','491','02');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (65,'85','816','04');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (66,'11','058','20');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (67,'45','579','69');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (68,'35','417','45');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (69,'87','058','89');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (70,'53','426','20');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (71,'08','724','26');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (72,'00','151','39');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (73,'57','307','65');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (74,'27','785','43');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (75,'91','964','40');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (76,'27','999','11');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (77,'80','463','13');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (78,'93','857','06');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (79,'36','007','43');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (80,'06','582','83');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (81,'24','150','17');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (82,'97','544','27');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (83,'58','771','46');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (84,'47','426','67');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (85,'24','757','22');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (86,'22','956','28');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (87,'88','289','38');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (88,'54','066','95');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (89,'07','716','27');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (90,'19','362','62');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (91,'82','920','70');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (92,'62','413','03');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (93,'12','202','97');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (94,'92','215','89');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (95,'49','663','65');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (96,'39','147','37');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (97,'63','931','60');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (98,'12','424','63');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (99,'63','257','20');
INSERT INTO COMPRA (ID,ID_PERSONA,COSTO,ID_SILLA) VALUES (100,'86','520','14');

COMMIT;