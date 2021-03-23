
drop table if exists peliculas;
drop table if exists director;

create table peliculas(
    id int primary key auto_increment,
    nombre varchar(200) not null,
    ano int,
    descripcion varchar(2000),
    imagen varchar(700)
);

INSERT INTO peliculas
(id,nombre,ano,descripcion,imagen)
VALUES
(10,'El viaje de Chihiro', 2001,'Chihiro es una niña de diez años que viaja en coche con sus padres. Después de atravesar un túnel, llegan a un mundo fantástico, en el que no hay lugar para los seres humanos, sólo para los dioses de primera y segunda clase. Cuando descubre que sus padres han sido convertidos en cerdos, Chihiro se siente muy sola y asustada','https://cdn.forbes.com.mx/2020/03/El-viaje-de-Chihiro-640x360.jpg'),
(1,'La tumba de las luciernagas', 1988,'Japón, Segunda Guerra Mundial. Dos huérfanos luchan por sobrevivir en una sociedad brutal mientras escapan de la guerra y tratan de no morirse de hambre.','https://www.latercera.com/resizer/JpR0sYRXx0Y3XjKYyuSQ5_1l6F8=/900x600/smart/cloudfront-us-east-1.images.arcpublishing.com/copesa/3TX4TUFMAZG6HMUDNVDHC3YMIA.jpg' ),
(2,'El castillo en el cielo', 1986,'En esta aventura infantil, un joven minero y una misteriosa chica buscan una isla perdida que, según la leyenda, oculta grandes riquezas.', 'https://pasionporelcine.net/wp-content/uploads/2019/08/El-castillo-en-el-cielo-robot.jpg.webp'),
(3,'Kiki: entregas a domicilio', 1989,'En esta aventura animada, Kiki se muda fuera de la casa de sus padres para perfeccionar su magia, pero descubre que hacer nuevos amigos es más difícil de lo que parece.','https://enfilme.com/img/content/kiki_delivery_Enfilme_23r13_675_489.jpg'),
(4,'La princesa Mononoke',1997,'Un príncipe herido por una maldición mortal viaja en busca de la cura y llega al medio de una batalla entre un pueblo minero y los animales del bosque.', 'https://cdn.revistacactus.com/wp-content/uploads/2018/02/Mononoke.jpg'),
(5,'El castillo ambulante', 2004,'Sophie es una adolescente que trabaja en una tienda de sombreros en un pueblo como muchos, pero su vida da un giro total cuando una bruja la transforma en una anciana.','https://lamanodelextranjero.files.wordpress.com/2014/05/el-estupendo-castillo-de-howl-en-movimiento.jpg'),
(6,'Susurros del corazón', 1995, 'Luego de notar que todos sus libros de la biblioteca ya habían sido prestados por la misma persona, Shizuku se dispone a conocerla y a perseguir sus sueños.', 'https://www.latercera.com/resizer/in7IP1RiJ0SiMJxglxGPyC6HVak=/900x600/smart/arc-anglerfish-arc2-prod-copesa.s3.amazonaws.com/public/OBJ6UC6HGFG4ZEG76NXCEE4TDU.jpg'),
(7,'Ponyo y el secreto de la sirenita', 2008,'Sosuke, un niño de 5 años, forja una amistad con una princesita pez a quien bautiza Ponyo, quien quiere desesperadamente ser humana.', 'https://www.fantasymundo.com/wp-content/uploads/2020/04/ponyo-acantilado-696x377.jpg'),
(8,'Mi vecino Totoro', 1988, 'Cuando hospitalizan a su madre, estas dos hermanas van a la campiña japonesa a pasar el verano con su padre.','https://nosequever.cl/wp-content/uploads/2020/02/totoro.jpg'),
(9,'El viento se levanta',2013,'El animador Hayao Miyazaki narra una historia de varias décadas inspirada en la vida de Jirô Horikoshi, diseñador del Zero, avión de caza de la Segunda Guerra Mundial.', 'http://revistacultural.ecosdeasia.com/wp-content/uploads/2014/05/wind3.jpg');

create table director(
    id int primary key auto_increment,
    nombre varchar(200) not null,
    info varchar(500),
    imagen varchar(200)
);

insert into director
(id,nombre,info, imagen)
values
(1,'Hayao Miyazaki','https://es.wikipedia.org/wiki/Hayao_Miyazaki','https://phantom-elmundo.unidadeditorial.es/c40925eef0ccfe0aeb87bdef0160c958/crop/0x0/694x1019/resize/473/f/webp/assets/multimedia/imagenes/2021/01/04/16097856968183.jpg'),
(2,'Isao Takahata','https://es.wikipedia.org/wiki/Isao_Takahata','https://www.cartoonbrew.com/wp-content/uploads/2018/04/isaotakahata_rip-1280x600.jpg'),
(3,'Yoshifumi Kondō','https://es.wikipedia.org/wiki/Yoshifumi_Kond%C5%8D','https://4.bp.blogspot.com/-Z2Z99w9n1nA/UVWbuIMeWFI/AAAAAAAACZc/s54YjSicyuM/s1600/yoshifumi-kondo.jpg'),
(4, 'Goro Miyazaki','https://es.wikipedia.org/wiki/Gor%C5%8D_Miyazaki', 'http://anime.es/wp-content/uploads/2015/07/goro-miyazaki-animemx.jpg');
alter table peliculas
add column director_id int,
add foreign key(director_id) references director(id);

update peliculas set director_id=1 where id in(10,2,3,4,5,7,8,9);

update peliculas set director_id=2 where id=1;

update peliculas set director_id=3 where id=6;

alter table peliculas
modify director_id int not null;

