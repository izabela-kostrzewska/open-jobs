insert into user (id, email, password, role) values (1, 'ik-testowy@op.pl', '{noop}password', 'ADMINISTRATOR');
insert into user (id, email, password, role) values (2, 'knorthwood1@bigcartel.com', '{noop}mz7tk7TD', 'BUSINESS_USER');
insert into user (id, email, password, role) values (3, 'yjockle2@psu.edu', '{noop}gAJnhFT0Y', 'BUSINESS_USER');
insert into user (id, email, password, role) values (4, 'lhuxstep3@liveinternet.ru', '{noop}nvSy6f4', 'BUSINESS_USER');
insert into user (id, email, password, role) values (5, 'pajam4@gmpg.org', '{noop}svTNKEwT', 'BUSINESS_USER');
insert into user (id, email, password, role) values (6, 'rcodman5@nba.com', '{noop}94WMIo2Rk', 'BUSINESS_USER');
insert into user (id, email, password, role) values (7, 'leadmeades6@comsenz.com', '{noop}ut5bZEEmvB2I', 'BUSINESS_USER');
insert into user (id, email, password, role) values (8, 'rblythin7@howstuffworks.com', '{noop}jRPLtxr3', 'BUSINESS_USER');
insert into user (id, email, password, role) values (9, 'dmartinetto8@youku.com', '{noop}irw1lu', 'BUSINESS_USER');
insert into user (id, email, password, role) values (10, 'rtrathen9@cnbc.com', '{noop}XHT6EXSR', 'BUSINESS_USER');

insert into company (user_id, name, address, description, logo_image) values (9, 'Meezzy', '8635 Rowland Circle', 'lobortis convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci mauris lacinia sapien', 'http://dummyimage.com/202x100.png/cc0000/ffffff');
insert into company (user_id, name, address, description, logo_image) values (3, 'Thoughtstorm', '5 Hollow Ridge Road', 'a odio in hac habitasse platea dictumst maecenas ut massa quis augue', 'http://dummyimage.com/195x100.png/dddddd/000000');
insert into company (user_id, name, address, description, logo_image) values (2, 'Teklist', '0 Blue Bill Park Way', 'dui maecenas tristique est et tempus semper est quam pharetra magna ac consequat metus sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae mauris viverra diam vitae quam suspendisse potenti nullam porttitor lacus at turpis', 'http://dummyimage.com/147x100.png/dddddd/000000');
insert into company (user_id, name, address, description, logo_image) values (10, 'Edgeclub', '367 Schurz Junction', 'dignissim vestibulum vestibulum ante ipsum primis in faucibus orci luctus et ultrices', 'http://dummyimage.com/105x100.png/5fa2dd/ffffff');
insert into company (user_id, name, address, description, logo_image) values (5, 'Livetube', '59186 Hoffman Park', 'montes nascetur ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque penatibus et magnis dis parturient montes', 'http://dummyimage.com/156x100.png/cc0000/ffffff');
insert into company (user_id, name, address, description, logo_image) values (9, 'Meevee', '778 3rd Point', 'ac diam cras pellentesque volutpat dui maecenas tristique est et tempus semper est quam pharetra magna ac consequat metus sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae mauris viverra diam vitae quam suspendisse potenti nullam porttitor', 'http://dummyimage.com/157x100.png/cc0000/ffffff');
insert into company (user_id, name, address, description, logo_image) values (6, 'Linkbuzz', '5627 Miller Plaza', 'consequat varius integer ac leo pellentesque ultrices mattis odio donec vitae nisi nam ultrices libero non mattis', 'http://dummyimage.com/231x100.png/cc0000/ffffff');
insert into company (user_id, name, address, description, logo_image) values (2, 'Realcube', '3381 Vernon Point', 'in hac habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc commodo placerat praesent blandit nam nulla', 'http://dummyimage.com/171x100.png/cc0000/ffffff');
insert into company (user_id, name, address, description, logo_image) values (8, 'Browseblab', '50 Jenifer Terrace', 'hac habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia', 'http://dummyimage.com/141x100.png/5fa2dd/ffffff');
insert into company (user_id, name, address, description, logo_image) values (4, 'Zoomcast', '87 Marcy Hill', 'amet cursus id turpis integer aliquet massa id lobortis convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci', 'http://dummyimage.com/208x100.png/dddddd/000000');

insert into contract (id, type, min_salary, max_salary) values (1, 'UNPAID_INTERNSHIP', null, null);
insert into contract (id, type, min_salary, max_salary) values (2, 'B2B', 9000, 25000);
insert into contract (id, type, min_salary, max_salary) values (3, 'SPECIFIC_TASK_CONTRACT', 4000, 6000);
insert into contract (id, type, min_salary, max_salary) values (4, 'EMPLOYMENT_CONTRACT', 6000, 13000);
insert into contract (id, type, min_salary, max_salary) values (5, 'MANDATE_CONTRACT', 10407, 24368);
insert into contract (id, type, min_salary, max_salary) values (6, 'MANDATE_CONTRACT', 6297, 17105);
insert into contract (id, type, min_salary, max_salary) values (7, 'SPECIFIC_TASK_CONTRACT', 7461, null);
insert into contract (id, type, min_salary, max_salary) values (8, 'UNPAID_INTERNSHIP', null, null);
insert into contract (id, type, min_salary, max_salary) values (9, 'UNPAID_INTERNSHIP', null, null);
insert into contract (id, type, min_salary, max_salary) values (10, 'MANDATE_CONTRACT', 10000, 18000);
insert into contract (id, type, min_salary, max_salary) values (11, 'UNPAID_INTERNSHIP', null, null);
insert into contract (id, type, min_salary, max_salary) values (12, 'EMPLOYMENT_CONTRACT', 5000, 8000);
insert into contract (id, type, min_salary, max_salary) values (13, 'EMPLOYMENT_CONTRACT', 7000, 10000);
insert into contract (id, type, min_salary, max_salary) values (14, 'EMPLOYMENT_CONTRACT', 6000, 13000);
insert into contract (id, type, min_salary, max_salary) values (15, 'SPECIFIC_TASK_CONTRACT', 4000, 9000);
insert into contract (id, type, min_salary, max_salary) values (16, 'UNPAID_INTERNSHIP', null, null);
insert into contract (id, type, min_salary, max_salary) values (17, 'SPECIFIC_TASK_CONTRACT', 7000, 9000);
insert into contract (id, type, min_salary, max_salary) values (18, 'MANDATE_CONTRACT', 7000, 15000);
insert into contract (id, type, min_salary, max_salary) values (19, 'MANDATE_CONTRACT', 4000, 6000);
insert into contract (id, type, min_salary, max_salary) values (20, 'B2B', 9000, 15000);

insert into offer (id, company_id, contract_id, position, description) values (1, 1, 20, 'Budget/Accounting Analyst I', 'augue quam sollicitudin vitae consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc commodo placerat praesent blandit nam nulla integer pede justo lacinia eget tincidunt eget');
insert into offer (id, company_id, contract_id, position, description) values (2, 6, 5, 'Analyst Programmer', 'mattis egestas metus aenean fermentum donec ut mauris eget massa tempor convallis nulla neque');
insert into offer (id, company_id, contract_id, position, description) values (3, 3, 12, 'Senior Editor', 'tristique in tempus sit amet sem fusce consequat nulla nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim blandit mi in porttitor pede justo eu massa donec dapibus duis at velit eu');
insert into offer (id, company_id, contract_id, position, description) values (4, 7, 16, 'Assistant Manager', 'tortor sollicitudin mi sit amet lobortis sapien sapien non mi integer ac neque duis bibendum morbi non quam nec dui luctus rutrum nulla tellus in sagittis dui vel nisl duis ac nibh fusce lacus');
insert into offer (id, company_id, contract_id, position, description) values (5, 1, 11, 'Analyst Programmer', 'proin eu mi nulla ac enim in tempor turpis nec euismod scelerisque quam turpis adipiscing lorem vitae mattis nibh ligula nec sem duis aliquam convallis nunc proin at turpis a pede');
insert into offer (id, company_id, contract_id, position, description) values (6, 4, 13, 'Recruiter', 'in magna bibendum imperdiet nullam orci pede venenatis non sodales sed tincidunt eu felis');
insert into offer (id, company_id, contract_id, position, description) values (7, 5, 20, 'Geological Engineer', 'vitae nisl aenean lectus pellentesque eget nunc donec quis orci eget orci vehicula condimentum curabitur in libero ut massa volutpat convallis morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit amet erat nulla');
insert into offer (id, company_id, contract_id, position, description) values (8, 3, 1, 'Teacher', 'ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi');
insert into offer (id, company_id, contract_id, position, description) values (9, 1, 3, 'Legal Assistant', 'turpis sed ante vivamus tortor duis mattis egestas metus aenean fermentum donec ut mauris');
insert into offer (id, company_id, contract_id, position, description) values (10, 3, 15, 'Professor', 'lectus in est risus auctor sed tristique in tempus sit amet sem fusce consequat nulla nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim blandit mi in');
insert into offer (id, company_id, contract_id, position, description) values (11, 5, 19, 'Recruiter', 'aliquam lacus morbi quis tortor id nulla ultrices aliquet maecenas leo odio condimentum id luctus nec molestie sed justo pellentesque viverra pede ac diam cras pellentesque');
insert into offer (id, company_id, contract_id, position, description) values (12, 10, 14, 'Developer IV', 'consectetuer adipiscing elit proin risus praesent lectus vestibulum quam sapien varius ut blandit non interdum in ante vestibulum ante ipsum primis in faucibus orci luctus et');
insert into offer (id, company_id, contract_id, position, description) values (13, 9, 6, 'Social Worker', 'tortor sollicitudin mi sit amet lobortis sapien sapien non mi integer ac neque duis bibendum morbi non quam nec dui luctus rutrum nulla tellus in sagittis dui vel nisl duis ac nibh fusce lacus purus aliquet at feugiat non');
insert into offer (id, company_id, contract_id, position, description) values (14, 5, 11, 'Staff Accountant I', 'etiam pretium iaculis justo in hac habitasse platea dictumst etiam');
insert into offer (id, company_id, contract_id, position, description) values (15, 4, 4, 'Structural Engineer', 'est quam pharetra magna ac consequat metus sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae mauris viverra diam vitae quam');
insert into offer (id, company_id, contract_id, position, description) values (16, 3, 6, 'Senior Quality Engineer', 'volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla rhoncus mauris enim leo rhoncus sed vestibulum sit amet cursus id turpis integer aliquet massa id lobortis convallis tortor risus dapibus augue');
insert into offer (id, company_id, contract_id, position, description) values (17, 10, 10, 'Help Desk Technician', 'ac diam cras pellentesque volutpat dui maecenas tristique est et tempus semper est quam pharetra magna ac consequat metus sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae mauris viverra');
insert into offer (id, company_id, contract_id, position, description) values (18, 3, 16, 'Quality Control Specialist', 'sem sed sagittis nam congue risus semper porta volutpat quam pede lobortis ligula sit amet eleifend pede libero quis orci nullam molestie nibh in lectus');
insert into offer (id, company_id, contract_id, position, description) values (19, 9, 11, 'VP Accounting', 'ultrices enim lorem ipsum dolor sit amet consectetuer adipiscing elit proin interdum mauris non ligula pellentesque');
insert into offer (id, company_id, contract_id, position, description) values (20, 2, 8, 'Actuary', 'odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit amet erat nulla tempus vivamus in');
insert into offer (id, company_id, contract_id, position, description) values (21, 3, 7, 'Statistician III', 'elementum nullam varius nulla facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt');
insert into offer (id, company_id, contract_id, position, description) values (22, 1, 20, 'Senior Quality Engineer', 'cursus id turpis integer aliquet massa id lobortis convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci mauris lacinia sapien quis libero nullam sit amet turpis elementum ligula vehicula consequat');
insert into offer (id, company_id, contract_id, position, description) values (23, 8, 16, 'Human Resources Assistant III', 'mus etiam vel augue vestibulum rutrum rutrum neque aenean auctor gravida sem praesent id massa id nisl venenatis lacinia aenean sit amet justo morbi ut odio cras');
insert into offer (id, company_id, contract_id, position, description) values (24, 2, 3, 'Computer Systems Analyst IV', 'ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus etiam vel augue vestibulum rutrum');
insert into offer (id, company_id, contract_id, position, description) values (25, 10, 15, 'Executive Secretary', 'nec dui luctus rutrum nulla tellus in sagittis dui vel nisl duis ac nibh fusce lacus purus aliquet');
insert into offer (id, company_id, contract_id, position, description) values (26, 1, 7, 'Senior Financial Analyst', 'a ipsum integer a nibh in quis justo maecenas rhoncus aliquam lacus morbi quis tortor id nulla ultrices aliquet maecenas leo odio condimentum id luctus nec molestie sed justo pellentesque');
insert into offer (id, company_id, contract_id, position, description) values (27, 8, 9, 'Information Systems Manager', 'congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales scelerisque mauris sit amet eros suspendisse accumsan tortor quis');
insert into offer (id, company_id, contract_id, position, description) values (28, 8, 10, 'Geologist III', 'nisl duis ac nibh fusce lacus purus aliquet at feugiat non pretium quis lectus suspendisse potenti in eleifend quam');
insert into offer (id, company_id, contract_id, position, description) values (29, 5, 18, 'VP Quality Control', 'eget semper rutrum nulla nunc purus phasellus in felis donec semper sapien a libero nam dui proin leo odio porttitor id consequat in consequat ut nulla sed accumsan');
insert into offer (id, company_id, contract_id, position, description) values (30, 8, 17, 'Research Associate', 'quam pharetra magna ac consequat metus sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae mauris viverra diam vitae quam suspendisse potenti nullam porttitor lacus at turpis donec posuere');

insert into technology (id, name) values (1, 'Java');
insert into technology (id, name) values (2, 'Python');
insert into technology (id, name) values (3, 'Sql');
insert into technology (id, name) values (4, 'Docker');
insert into technology (id, name) values (5, 'PHP');
insert into technology (id, name) values (6, 'C++');
insert into technology (id, name) values (7, 'C#');
insert into technology (id, name) values (8, 'Javascript');
insert into technology (id, name) values (9, '.Net');
insert into technology (id, name) values (10, 'React');
insert into technology (id, name) values (11, 'Angular');
insert into technology (id, name) values (12, 'Android');
insert into technology (id, name) values (13, 'Scala');
insert into technology (id, name) values (14, 'Html&css');
insert into technology (id, name) values (15, 'Kotlin');

insert into requirement (offer_id, technology_id, level) values (21, 13, 3);
insert into requirement (offer_id, technology_id, level) values (6, 10, 5);
insert into requirement (offer_id, technology_id, level) values (17, 1, 4);
insert into requirement (offer_id, technology_id, level) values (15, 12, 4);
insert into requirement (offer_id, technology_id, level) values (24, 2, 5);
insert into requirement (offer_id, technology_id, level) values (13, 6, 4);
insert into requirement (offer_id, technology_id, level) values (18, 5, 1);
insert into requirement (offer_id, technology_id, level) values (4, 6, 2);
insert into requirement (offer_id, technology_id, level) values (18, 7, 2);
insert into requirement (offer_id, technology_id, level) values (20, 7, 1);
insert into requirement (offer_id, technology_id, level) values (15, 14, 3);
insert into requirement (offer_id, technology_id, level) values (24, 9, 2);
insert into requirement (offer_id, technology_id, level) values (13, 4, 4);
insert into requirement (offer_id, technology_id, level) values (17, 2, 5);
insert into requirement (offer_id, technology_id, level) values (11, 9, 1);
insert into requirement (offer_id, technology_id, level) values (2, 4, 1);
insert into requirement (offer_id, technology_id, level) values (4, 2, 3);
insert into requirement (offer_id, technology_id, level) values (30, 7, 4);
insert into requirement (offer_id, technology_id, level) values (9, 9, 2);
insert into requirement (offer_id, technology_id, level) values (4, 9, 5);
insert into requirement (offer_id, technology_id, level) values (20, 6, 2);
insert into requirement (offer_id, technology_id, level) values (21, 13, 3);
insert into requirement (offer_id, technology_id, level) values (16, 6, 2);
insert into requirement (offer_id, technology_id, level) values (28, 2, 3);
insert into requirement (offer_id, technology_id, level) values (11, 2, 4);
insert into requirement (offer_id, technology_id, level) values (10, 7, 2);
insert into requirement (offer_id, technology_id, level) values (21, 12, 2);
insert into requirement (offer_id, technology_id, level) values (13, 4, 2);
insert into requirement (offer_id, technology_id, level) values (28, 11, 1);
insert into requirement (offer_id, technology_id, level) values (18, 13, 2);