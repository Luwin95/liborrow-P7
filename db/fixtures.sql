INSERT INTO  book(item_id, title, language, release, summary, editor, itemref,totalcount, remainingcount, alley, place, type) VALUES
	(1, 'Hello world', 'Français', '2001-09-28', 'Une chronique sur le monde', 'Galimard','sdhgfsgfvisd', 5, 1, 'A', '32E', 'B'),
	(2, 'Hello world 2', 'Français', '2003-09-28', 'Le retour de la chronique sur le monde', 'Galimard','gsfdcqsghf', 7, 4, 'B', '41F', 'B'),
	(5, 'Les trois Mousquetaires', 'Français', '1993-07-06', E'Le plus grand classique de cape et d\'épée', 'Flammarion','gsdvcfze', 2, 0, 'C', '50G', 'B'),
	(6, 'Vingt ans après', 'Français', '1987-06-06', E'La suite du plus grand classique de cape et d\'épée', 'Galimard','sgdvgzsed', 1, 0, 'D', '69H', 'B');

INSERT INTO magazine(item_id, editionnumber, name, publishdate,itemref,totalcount, remainingcount, alley, place, type) VALUES 
	(3,15, 'Le petit spirou', '2017-10-15','gzefzefhgqzjgfq', 4, 3, 'C', '50G', 'M'),
	(4,250, 'Le monde', '2015-12-21','escuhkfgvzeezcrvzf', 7, 5, 'D', '69H', 'M');
	
INSERT INTO author(author_id, name, firstname, birth, death, biography) VALUES
	(1, 'Proust', 'Marcel', 1871, 1922, E'Ecrivain d\'origine française'),
	(2, 'Test', 'test', 1900, 1990, 'Ecrivain Franco-allemand'),
	(3, 'Dumas', 'Alexandre', 1802, 1870, E'Ecrivain d\'origine française');

INSERT INTO citizenship(citizenship_id, countryname) VALUES
(1, 'Afghanistan'),
(2, 'Albanie'),
(3, 'Antarctique'),
(4, 'Algérie'),
(5, 'Samoa Américaines'),
(6, 'Andorre'),
(7, 'Angola'),
(8, 'Antigua-et-Barbuda'),
(9, 'Azerbaïdjan'),
(10, 'Argentine'),
(11, 'Australie'),
(12, 'Autriche'),
(13, 'Bahamas'),
(14, 'Bahreïn'),
(15, 'Bangladesh'),
(16, 'Arménie'),
(17, 'Barbade'),
(18, 'Belgique'),
(19, 'Bermudes'),
(20, 'Bhoutan'),
(21, 'Bolivie'),
(22, 'Bosnie-Herzégovine'),
(23, 'Botswana'),
(24, 'Île Bouvet'),
(25, 'Brésil'),
(26, 'Belize'),
(27, E'Territoire Britannique de l\'Océan Indien'),
(28, 'Îles Salomon'),
(29, 'Îles Vierges Britanniques'),
(30, 'Brunéi Darussalam'),
(31, 'Bulgarie'),
(32, 'Myanmar'),
(33, 'Burundi'),
(34, 'Bélarus'),
(35, 'Cambodge'),
(36, 'Cameroun'),
(37, 'Canada'),
(38, 'Cap-vert'),
(39, 'Îles Caïmanes'),
(40, 'République Centrafricaine'),
(41, 'Sri Lanka'),
(42, 'Tchad'),
(43, 'Chili'),
(44, 'Chine'),
(45, 'Taïwan'),
(46, 'Île Christmas'),
(47, 'Îles Cocos (Keeling)'),
(48, 'Colombie'),
(49, 'Comores'),
(50, 'Mayotte'),
(51, 'République du Congo'),
(52, 'République Démocratique du Congo'),
(53, 'Îles Cook'),
(54, 'Costa Rica'),
(55, 'Croatie'),
(56, 'Cuba'),
(57, 'Chypre'),
(58, 'République Tchèque'),
(59, 'Bénin'),
(60, 'Danemark'),
(61, 'Dominique'),
(62, 'République Dominicaine'),
(63, 'Équateur'),
(64, 'El Salvador'),
(65, 'Guinée Équatoriale'),
(66, 'Éthiopie'),
(67, 'Érythrée'),
(68, 'Estonie'),
(69, 'Îles Féroé'),
(70, 'Îles (malvinas) Falkland'),
(71, 'Géorgie du Sud et les Îles Sandwich du Sud'),
(72, 'Fidji'),
(73, 'Finlande'),
(74, 'Îles Åland'),
(75, 'France'),
(76, 'Guyane Française'),
(77, 'Polynésie Française'),
(78, 'Terres Australes Françaises'),
(79, 'Djibouti'),
(80, 'Gabon'),
(81, 'Géorgie'),
(82, 'Gambie'),
(83, 'Territoire Palestinien Occupé'),
(84, 'Allemagne'),
(85, 'Ghana'),
(86, 'Gibraltar'),
(87, 'Kiribati'),
(88, 'Grèce'),
(89, 'Groenland'),
(90, 'Grenade'),
(91, 'Guadeloupe'),
(92, 'Guam'),
(93, 'Guatemala'),
(94, 'Guinée'),
(95, 'Guyana'),
(96, 'Haïti'),
(97, 'Îles Heard et Mcdonald'),
(98, 'Saint-Siège (état de la Cité du Vatican)'),
(99, 'Honduras'),
(100, 'Hong-Kong'),
(101, 'Hongrie'),
(102, 'Islande'),
(103, 'Inde'),
(104, 'Indonésie'),
(105, E'République Islamique d\'Iran'),
(106, 'Iraq'),
(107, 'Irlande'),
(108, 'Israël'),
(109, 'Italie'),
(110, 'Côte d''Ivoire'),
(111, 'Jamaïque'),
(112, 'Japon'),
(113, 'Kazakhstan'),
(114, 'Jordanie'),
(115, 'Kenya'),
(116, 'République Populaire Démocratique de Corée'),
(117, 'République de Corée'),
(118, 'Koweït'),
(119, 'Kirghizistan'),
(120, 'République Démocratique Populaire Lao'),
(121, 'Liban'),
(122, 'Lesotho'),
(123, 'Lettonie'),
(124, 'Libéria'),
(125, 'Jamahiriya Arabe Libyenne'),
(126, 'Liechtenstein'),
(127, 'Lituanie'),
(128, 'Luxembourg'),
(129, 'Macao'),
(130, 'Madagascar'),
(131, 'Malawi'),
(132, 'Malaisie'),
(133, 'Maldives'),
(134, 'Mali'),
(135, 'Malte'),
(136, 'Martinique'),
(137, 'Mauritanie'),
(138, 'Maurice'),
(139, 'Mexique'),
(140, 'Monaco'),
(141, 'Mongolie'),
(142, 'République de Moldova'),
(143, 'Montserrat'),
(144, 'Maroc'),
(145, 'Mozambique'),
(146, 'Oman'),
(147, 'Namibie'),
(148, 'Nauru'),
(149, 'Népal'),
(150, 'Pays-Bas'),
(151, 'Antilles Néerlandaises'),
(152, 'Aruba'),
(153, 'Nouvelle-Calédonie'),
(154, 'Vanuatu'),
(155, 'Nouvelle-Zélande'),
(156, 'Nicaragua'),
(157, 'Niger'),
(158, 'Nigéria'),
(159, 'Niué'),
(160, 'Île Norfolk'),
(161, 'Norvège'),
(162, 'Îles Mariannes du Nord'),
(163, 'Îles Mineures Éloignées des États-Unis'),
(164, 'États Fédérés de Micronésie'),
(165, 'Îles Marshall'),
(166, 'Palaos'),
(167, 'Pakistan'),
(168, 'Panama'),
(169, 'Papouasie-Nouvelle-Guinée'),
(170, 'Paraguay'),
(171, 'Pérou'),
(172, 'Philippines'),
(173, 'Pitcairn'),
(174, 'Pologne'),
(175, 'Portugal'),
(176, 'Guinée-Bissau'),
(177, 'Timor-Leste'),
(178, 'Porto Rico'),
(179, 'Qatar'),
(180, 'Réunion'),
(181, 'Roumanie'),
(182, 'Fédération de Russie'),
(183, 'Rwanda'),
(184, 'Sainte-Hélène'),
(185, 'Saint-Kitts-et-Nevis'),
(186, 'Anguilla'),
(187, 'Sainte-Lucie'),
(188, 'Saint-Pierre-et-Miquelon'),
(189, 'Saint-Vincent-et-les Grenadines'),
(190, 'Saint-Marin'),
(191, 'Sao Tomé-et-Principe'),
(192, 'Arabie Saoudite'),
(193, 'Sénégal'),
(194, 'Seychelles'),
(195, 'Sierra Leone'),
(196, 'Singapour'),
(197, 'Slovaquie'),
(198, 'Viet Nam'),
(199, 'Slovénie'),
(200, 'Somalie'),
(201, 'Afrique du Sud'),
(202, 'Zimbabwe'),
(203, 'Espagne'),
(204, 'Sahara Occidental'),
(205, 'Soudan'),
(206, 'Suriname'),
(207, 'Svalbard etÎle Jan Mayen'),
(208, 'Swaziland'),
(209, 'Suède'),
(210, 'Suisse'),
(211, 'République Arabe Syrienne'),
(212, 'Tadjikistan'),
(213, 'Thaïlande'),
(214, 'Togo'),
(215, 'Tokelau'),
(216, 'Tonga'),
(217, 'Trinité-et-Tobago'),
(218, 'Émirats Arabes Unis'),
(219, 'Tunisie'),
(220, 'Turquie'),
(221, 'Turkménistan'),
(222, 'Îles Turks et Caïques'),
(223, 'Tuvalu'),
(224, 'Ouganda'),
(225, 'Ukraine'),
(226, E'L\'ex-République Yougoslave de Macédoine'),
(227, 'Égypte'),
(228, 'Royaume-Uni'),
(229, 'Île de Man'),
(230, 'République-Unie de Tanzanie'),
(231, 'États-Unis'),
(232, 'Îles Vierges des États-Unis'),
(233, 'Burkina Faso'),
(234, 'Uruguay'),
(235, 'Ouzbékistan'),
(236, 'Venezuela'),
(237, 'Wallis et Futuna'),
(238, 'Samoa'),
(239, 'Yémen'),
(240, 'Serbie'),
(241, 'Zambie'),
(242, 'Monténégro');

INSERT INTO author_citizenship(author_id, citizenship_id) VALUES
	(1,75),
	(2,84),
	(3,75);
	
INSERT INTO author_book(author_id, item_id) VALUES
	(1,1),
	(2,1),
	(1,2);
	
INSERT INTO user_account(email, password, firstname, lastname, address, postcode, phonenumber, citizenship_id, role) VALUES
	('test@gmail.com', '$2a$10$FQcevRJdVVqyrtM7fVV8JuIbTpeNpJ26C7LbwLZTXOV8PSvxInSX.', 'test', 'test', '10 Avenue du test', '95600', '0123456789', 75, 'ROLE_USER'),
	('new@gmail.com', '$2a$10$FQcevRJdVVqyrtM7fVV8JuIbTpeNpJ26C7LbwLZTXOV8PSvxInSX.', 'new', 'lenouveau', '25 rue des maronniers', '78000', '0123456789', 75, 'ROLE_LIBRARIAN'),
	('b.aubin95@live.fr', '$2a$10$FQcevRJdVVqyrtM7fVV8JuIbTpeNpJ26C7LbwLZTXOV8PSvxInSX.', 'nouveau', 'nouveau', '25 rue des maronniers', '78000', '0123456789', 75, 'ROLE_USER');
	
INSERT INTO borrow(startDate, extended, user_id,item_id) VALUES
	( '2017-10-15', 'true', 1,1);
	
INSERT INTO borrow(startDate, getBackDate, extended, user_id,item_id) VALUES	
	('2017-11-15', '2017-12-15','true', 1,2);
	
INSERT INTO borrow(startDate, extended, user_id,item_id) VALUES
	('2017-10-15', 'true', 1,3);
	
INSERT INTO borrow(startDate, getBackDate, extended, user_id,item_id) VALUES	
	('2017-11-15', '2017-12-15','true', 1,4);
	
INSERT INTO borrow(startDate, extended, user_id,item_id) VALUES
	('2017-10-15', 'true', 1,1);
	
INSERT INTO borrow(startDate, extended, user_id,item_id) VALUES
	('2018-01-27', 'false', 1,1);
    
INSERT INTO borrow(startDate, extended, user_id,item_id) VALUES
	('2017-12-27', 'false', 1,1);
    
INSERT INTO borrow(startDate, extended, user_id,item_id) VALUES
	('2018-01-02', 'false', 1,1);
	
INSERT INTO borrow(startDate, extended, user_id,item_id) VALUES
	('2017-10-15', 'true', 3,2);
	
INSERT INTO borrow(startDate, extended, user_id,item_id) VALUES
	('2017-10-15', 'true', 3,4);
	
INSERT INTO borrow(startDate, extended, user_id,item_id) VALUES
	('2018-05-09', 'true', 2,5);

INSERT INTO borrow(startDate, extended, user_id,item_id) VALUES
	('2018-05-08', 'false', 2,6);
	
INSERT INTO borrow(startDate, extended, user_id,item_id) VALUES
	('2018-05-10', 'false', 2,5);
	
INSERT INTO image(alt, path, title) VALUES
	('Hello world cover', 'Atlas.jpg', 'Hello world cover');
	
INSERT INTO image(alt, path, title) VALUES
	('spirou', 'spirou.jpg', 'spirou');
	
