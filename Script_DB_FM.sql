create Database Film_Magic;
use Film_Magic;
-- Drop database film_magic;

create table Empleado(
	Codigo_Empleado varchar(15) primary key,
    CUI_Empleado varchar(15) not null,
    Nombre_Empleado varchar(25) not null,
    Apellido_Empleado varchar(25) not null,
    Genero_Empleado char(1) not null,
    Telefono_Empleado int,
    Direccion_Empleado varchar(80),
    Estado_Empleado char(1)
)engine= InnoDB;

create table Cliente(
	Codigo_Cliente varchar(15) primary key,
    CUI_Cliente varchar(15) not null,
    Nombre_Cliente varchar(25) not null,
    Apellido_Cliente varchar(25) not null,
    Telefono_Cliente int,
    Cargo_Cliente float,
    Estado_Tarjeta_Cliente char(1) not null,
    
    Codigo_Empleado varchar(15),
    foreign key (Codigo_Empleado) references Empleado(Codigo_Empleado)
)engine=InnoDB;

create table Autor(
	ID_Autor varchar(15) primary key,
    Nombre_Autor varchar(50) not null,
    Apellido_Autor varchar(50) not null,
    Ciudad_Nacimiento varchar(80) not null
)engine=InnoDB;

create table Producto(
	ID_Producto varchar(20) primary	key,
    Nombre_Producto varchar(35) not null,
    -- Marca_Producto varchar(20) not null,
    Tipo_Producto varchar(50) not null,
    Precio_Producto float not null,
    Existencias_Producto int not null,
    Estado_Producto char(1),
	ID_Autor varchar(15),

    foreign key (ID_Autor) references Autor(ID_Autor)
)engine=InnoDB;

create table Renta(
	ID_Renta varchar(15) primary key,
    -- foraneas
    Codigo_Cliente varchar(15),
    ID_Producto varchar(20),
    
    Fecha_Renta date,
    Fecha_Vencimiento_Renta date,
    
    foreign key (Codigo_Cliente) references Cliente(Codigo_Cliente),
    foreign key (ID_Producto) references Producto (ID_producto)
)engine=InnoDB;

create table Devolucion(
	ID_Devolucion varchar(15) primary key,
    -- foranea 
	ID_Renta varchar(15),
    
    Fecha_Actual date,
    Cargo float,
    
    foreign key (ID_Renta)  references Renta(ID_Renta)
)engine=InnoDB;

create table Factura(
	ID_Factura varchar(20) primary key,
    -- foranea
    Codigo_Cliente varchar(15),
    Fecha date,
    Forma_Pago varchar(50),
    Total_Factura float,
    
    foreign key (Codigo_Cliente) references Cliente(Codigo_Cliente)
)engine=InnoDB;

create table Detalle_Factura(
	-- foraneas
	ID_Factura varchar(20),
    ID_Producto varchar(20),
    
    cantidad int,
    precio float,
    
    foreign key (ID_Factura) references Factura(ID_Factura),
    foreign key (ID_Producto) references Producto(ID_Producto)
)engine=InnoDB;