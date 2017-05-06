CREATE TABLE PERSONA
(
	ID NUMBER NOT NULL,
	EDAD NUMBER NOT NULL,
	TIPO NUMBER NOT NULL,
	NOMBRE VARCHAR(255),
	ID_CATEGORIA NUMBER NOT NULL,
	CONSTRAINT PK_PERSONA PRIMARY KEY(ID),
	CONSTRAINT FK_PREFERENCIA FOREIGN KEY(ID_CATEGORIA) REFERENCES CATEGORIA(ID)
);

INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (1,'04',4,'Skyler Shepherd','33');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (2,'18',3,'Linda Gillespie','96');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (3,'51',1,'Raven Norton','08');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (4,'67',2,'Rhiannon Mayo','37');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (5,'18',3,'Colorado Fernandez','32');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (6,'96',4,'Deirdre Raymond','00');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (7,'62',1,'Alvin Dillon','71');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (8,'97',2,'Armand Ayala','17');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (9,'93',1,'Hiroko Newton','10');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (10,'78',3,'Iris Slater','34');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (11,'22',4,'Marny Marquez','75');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (12,'13',2,'Steven Spence','76');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (13,'28',4,'Nola Roberson','73');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (14,'26',2,'Kermit Clay','83');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (15,'57',3,'Cara Hampton','21');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (16,'93',4,'Clare Macdonald','16');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (17,'16',2,'Kameko Michael','81');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (18,'81',1,'Lars Bradley','74');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (19,'15',3,'Adena Larson','73');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (20,'09',1,'Cedric Ellis','23');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (21,'70',4,'Brandon Merrill','67');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (22,'22',4,'Meredith Gregory','04');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (23,'47',1,'Brooke Oliver','65');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (24,'42',2,'Yoshi Massey','05');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (25,'52',4,'Ima Miranda','69');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (26,'26',2,'Danielle Schmidt','75');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (27,'20',1,'Natalie Reynolds','33');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (28,'37',3,'Leigh Rasmussen','29');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (29,'28',2,'Jada Reed','12');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (30,'69',2,'Adam Houston','25');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (31,'15',4,'Sandra Calderon','73');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (32,'13',2,'Kareem Gay','91');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (33,'76',1,'Ruth Mcgee','60');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (34,'94',3,'Odette Hewitt','61');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (35,'28',4,'Kyra Wilkinson','73');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (36,'56',1,'Amanda Palmer','60');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (37,'36',1,'Sean Harvey','38');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (38,'53',4,'Andrew Sargent','67');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (39,'21',2,'Sacha Gonzalez','67');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (40,'57',1,'Leilani Cooley','10');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (41,'89',1,'Sybill Kaufman','86');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (42,'61',2,'Karen Albert','58');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (43,'17',2,'Austin Miles','38');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (44,'84',3,'Ivor Sargent','90');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (45,'15',3,'Rafael Wiley','11');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (46,'94',1,'Jasmine Travis','26');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (47,'30',4,'Zena Norman','99');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (48,'45',1,'Armando Carson','98');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (49,'59',4,'Stacy Huffman','27');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (50,'43',3,'Cassandra Craig','20');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (51,'83',1,'Buckminster Vega','27');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (52,'74',2,'Brandon Clark','86');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (53,'76',1,'Noel Alvarado','06');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (54,'99',1,'Lysandra Galloway','93');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (55,'64',1,'Quinn Cooke','42');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (56,'59',2,'Unity Carlson','48');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (57,'13',1,'Stone Lang','90');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (58,'38',1,'Michael Patterson','05');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (59,'97',4,'Noah Hendricks','71');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (60,'77',1,'Gareth Dalton','17');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (61,'59',4,'Michael Merrill','91');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (62,'69',4,'Kellie Oneill','66');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (63,'84',2,'Eliana Abbott','67');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (64,'71',4,'Jessica Brooks','25');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (65,'35',4,'Justin Hurley','36');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (66,'19',3,'Rigel Boyer','32');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (67,'00',2,'Aretha Monroe','97');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (68,'04',3,'Eliana Bolton','41');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (69,'43',2,'Nathan Hensley','41');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (70,'70',4,'Fallon Yang','09');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (71,'95',4,'Hashim Stone','74');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (72,'53',4,'Zeph Holmes','50');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (73,'18',1,'Virginia Wolfe','81');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (74,'27',4,'Ivan Kidd','21');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (75,'95',2,'Kirestin Lewis','03');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (76,'51',4,'Shelby Brewer','20');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (77,'70',1,'Griffin Jarvis','63');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (78,'78',3,'Chester Garrison','81');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (79,'81',1,'Myra Schultz','48');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (80,'55',1,'Hedda Santos','49');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (81,'03',1,'Sylvia Wilkins','63');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (82,'43',2,'Conan Dunlap','09');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (83,'34',4,'Harlan Shepard','46');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (84,'47',1,'Jack Blankenship','16');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (85,'88',3,'Jacqueline Mueller','72');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (86,'68',4,'Scarlet Medina','81');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (87,'62',2,'Madaline Hamilton','27');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (88,'58',2,'Hayes Conway','26');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (89,'10',4,'Megan Talley','18');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (90,'80',1,'Benedict Sawyer','72');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (91,'19',1,'Giselle Sheppard','78');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (92,'85',1,'Alfreda Paul','40');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (93,'51',3,'Paula Moran','35');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (94,'24',1,'Joan Farley','28');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (95,'90',2,'Molly Emerson','50');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (96,'05',1,'Ella Weeks','68');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (97,'14',3,'Kiara Kidd','31');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (98,'42',2,'Raven Sosa','14');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (99,'07',3,'Maggy Hendrix','78');
INSERT INTO PERSONA (ID,EDAD,TIPO,NOMBRE,ID_CATEGORIA) VALUES (100,'57',3,'Anastasia Zamora','71');

COMMIT;