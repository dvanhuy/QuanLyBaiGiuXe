create database BaiGiuXe
go
use BaiGiuXe
go

create table LoaiXe
(
	idLoai varchar(10),
	tenxe nvarchar(50),
	donGia money,
	constraint PK_LoaiXe_idLoai  primary key (idLoai)
)

create table NguoiDung
(
	idUser char(7),
	hoTen nvarchar(30),
	tenTK varchar(30),
	matKhau char(5),
	gioiTinh nvarchar(3),
	queQuan nvarchar(30),
	soDT varchar(15),
	dinhDanh varchar(15),
	chucVu nvarchar(20),
	constraint PK_NguoiDung_idNV primary key (idUser),
	constraint CK_NguoiDung_chucVu check (chucVu in ('Admin','User'))
)

create table Xe
(
	idXe char(7),
	bienSo varchar(15),
	timeVao datetime,
	timeRa datetime,
	tienDaThu money,
	trangThai nvarchar(20),
	loaiXe varchar(10),
	nvThucHien char(7),
	constraint PK_Xe_idXe  primary key (idXe),
	constraint CK_Xe_trangThai check (trangThai in (N'Đã rời',N'Đang đậu')),
	constraint FK_Xe_loaiXe foreign key(loaiXe) references LoaiXe(idLoai),
	constraint FK_Xe_nvThucHien foreign key(nvThucHien) references NguoiDung(idUser)
)

insert into LoaiXe
values	('DAP',N'Xe đạp',200),
		('GANMAY',N'Xe gắn máy',400),
		('MOTO',N'Xe mô tô',500),
		('OTOO',N'Xe ô tô',1000),
		('BANTAI',N'Xe bán tải',1000)

--------------------------------------------------
insert into NguoiDung values
	('AD00001',N'Đinh Văn Huy','huy','12345','Nam',N'Đà Nẵng','0932222222','201850000','Admin'),
	('AD00002',N'Lê Đức Duy','duy','12345','Nam',N'Đà Nẵng','0833333333','2050531200123','Admin'),
	('AD00003',N'Nguyễn Trí Đức','duc','12345','Nam',N'Đà Nẵng','0999999999',null,'Admin'),
	('NV00001',N'Nhân viên 1','a1','1','Nam',N'Đà Nẵng','0987654321',null,'User'),
	('NV00002',N'Nhân viên 2','a2','1','Nam',N'Quảng Nam','0733554466',null,'User'),
	('NV00003',N'Nhân viên 3','a3','1','Nam',N'Quảng Nam','0733554466',null,'User')

insert into Xe(idXe,bienSo, timeVao,timeRa,tienDaThu,trangThai,loaiXe,nvThucHien)
values	('XE00001','78-S18569','2020/9/8 7:8:00','2020/9/8 7:8:00',3000,N'Đã rời','OTOO','AD00001'),
		('XE00002','78-S187899','2020/9/11 12:00:00','2020/9/8 20:00:00',3000,N'Đã rời','MOTO','AD00001'), 
		('XE00003','43-S197899','2020/9/22 12:00:00','2020/9/22 12:8:00',10000,N'Đã rời','MOTO','NV00001'),
		('XE00004','43-S187899','2020/10/1 12:00:00','2020/10/1 20:00:00',2000,N'Đã rời','OTOO','NV00001'),
		('XE00005','43-N123456','2020/11/11 12:00:00','2020/11/12 20:00:00',20000,N'Đã rời','OTOO','NV00001'),
		('XE00006','43-N783456','2020/11/15 12:00:00','2020/11/15 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00007',null,'2020/11/25 12:00:00','2020/11/26 12:00:00',30000,N'Đã rời','DAP','NV00002'),

		('XE00008','43-N783786',GETDATE(),null,0,N'Đang đậu','OTOO','NV00002'),
		('XE00009','43-N183456',GETDATE(),null,0,N'Đang đậu','OTOO','NV00002'),
		('XE00010','43-Y777777',GETDATE(),null,0,N'Đang đậu','OTOO','NV00002'),
		('XE00011','43-V666666',GETDATE(),null,0,N'Đang đậu','OTOO','NV00002'),
		('XE00012','43-U555555',GETDATE(),null,0,N'Đang đậu','BANTAI','NV00002'),
		('XE00013','43-R99999',GETDATE(),null,0,N'Đang đậu','MOTO','NV00002'),
		('XE00014','79-N78356',GETDATE(),null,0,N'Đang đậu','MOTO','NV00002')
----------

Select * 
from Xe 
where (idXe like '%4%') or (bienSo like '%4%') or (loaiXe like '%4%')