﻿create database BaiGiuXe
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
	matKhau varchar(30),
	gioiTinh nvarchar(5),
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
		('BANTAI',N'Xe bán tải',2000)

--------------------------------------------------
insert into NguoiDung values
	('AD00001',N'Đinh Văn Huy','huy','12345','Nam',N'Đà Nẵng','0932222222','201850000','Admin'),
	('AD00002',N'Lê Đức Duy','duy','12345','Nam',N'Đà Nẵng','0833333333','2050531200123','Admin'),
	('AD00003',N'Nguyễn Trí Đức','duc','12345','Nam',N'Đà Nẵng','0999999999',null,'Admin'),
	('NV00001',N'Nhân viên 1','a1','1','Nam',N'Đà Nẵng','0987654321',null,'User'),
	('NV00002',N'Nhân viên 2','a2','1','Nam',N'Quảng Nam','0733554466',null,'User'),
	('NV00003',N'Nhân viên 3','a3','1','Nam',N'Quảng Nam','0733554466',null,'User'),
	('NV00004',N'Nhân viên 4','a4','1','Nam',N'Đà Nẵng','0987654321',null,'User'),
	('NV00005',N'Nhân viên 5','a5','1','Nam',N'Quảng Nam','0733554466',null,'User'),
	('NV00006',N'Nhân viên 6','a6','1','Nam',N'Quảng Nam','0733554466',null,'User')


insert into Xe(idXe,bienSo, timeVao,timeRa,tienDaThu,trangThai,loaiXe,nvThucHien)
values	('XE00001','78-S18569','2020/9/8 7:8:00','2020/9/8 7:8:00',3000,N'Đã rời','OTOO','AD00001'),
		('XE00002','78-S187899','2020/9/11 12:00:00','2020/9/8 20:00:00',3000,N'Đã rời','MOTO','AD00001'), 
		('XE00003','43-S197899','2020/9/22 12:00:00','2020/9/22 12:8:00',10000,N'Đã rời','MOTO','NV00001'),
		('XE00004','43-S187899','2020/10/1 12:00:00','2020/10/1 20:00:00',2000,N'Đã rời','OTOO','NV00001'),
		('XE00005','43-N123456','2020/11/11 12:00:00','2020/11/12 20:00:00',20000,N'Đã rời','OTOO','NV00001'),
		('XE00006','43-N783456','2020/11/15 12:00:00','2020/11/17 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00007',null,'2020/11/25 12:00:00','2020/11/26 12:00:00',30000,N'Đã rời','DAP','NV00002'),
		('XE00008','43-SA23234','2022/04/02 12:00:00','2022/04/03 19:00:00',5000,N'Đã rời','MOTO','NV00001'),
		('XE00009','50-DL23211','2020/11/23 12:00:00','2020/11/25 19:00:00',5000,N'Đã rời','MOTO','NV00001'),
		('XE00010','32-S432123','2020/10/12 12:00:00','2020/10/15 19:00:00',5000,N'Đã rời','MOTO','NV00002'),
		('XE00011','44-N423412','2020/09/22 12:00:00','2020/10/15 19:00:00',5000,N'Đã rời','MOTO','NV00002'),
		('XE00012','43-L743556','2020/08/11 12:00:00','2020/12/14 19:00:00',5000,N'Đã rời','OTOO','NV00001'),
		('XE00013','43-G334356','2020/11/05 12:00:00','2020/11/13 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00014','54-LG43476','2020/12/04 12:00:00','2020/12/15 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00015','31-DN85456','2020/09/21 12:00:00','2020/10/15 19:00:00',5000,N'Đã rời','OTOO','NV00001'),
		('XE00016','21-NE12436','2020/03/24 12:00:00','2020/04/15 19:00:00',5000,N'Đã rời','MOTO','NV00002'),
		('XE00017','40-NA38346','2020/04/26 12:00:00','2020/05/15 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00018','23-NA78345','2020/05/27 12:00:00','2020/07/15 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00019','44-N278345','2020/11/23 12:00:00','2020/11/25 19:00:00',5000,N'Đã rời','MOTO','NV00001'),
		('XE00020','34-K383456','2020/11/12 12:00:00','2020/11/15 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00021','22-M733456','2020/11/22 12:00:00','2020/11/24 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00022','54-B743456','2020/09/30 12:00:00','2020/10/15 19:00:00',5000,N'Đã rời','BANTAI','NV00001'),
		('XE00023','43-N783456','2020/08/21 12:00:00','2020/08/25 19:00:00',5000,N'Đã rời','BANTAI','AD00002'),
		('XE00024','12-G232133','2020/11/03 12:00:00','2020/11/15 19:00:00',5000,N'Đã rời','BANTAI','AD00002'),
		('XE00025','09-J234123','2020/11/04 12:00:00','2020/11/15 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00026','09-SA41389','2020/03/05 12:00:00','2020/04/15 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00027','43-PA09232','2020/05/07 12:00:00','2020/12/15 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00028','43-G954731','2020/10/06 12:00:00','2020/11/15 19:00:00',5000,N'Đã rời','MOTO','NV00002'),
		('XE00029','32-K342122','2020/12/04 12:00:00','2020/12/15 19:00:00',5000,N'Đã rời','MOTO','NV00002'),
		('XE00030','21-N433122','2020/02/04 12:00:00','2020/03/15 19:00:00',5000,N'Đã rời','BANTAI','NV00001'),
		('XE00031','43-N093214','2020/02/10 12:00:00','2020/02/10 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00032','43-N452341','2020/03/21 12:00:00','2020/03/25 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00033','43-N845732','2020/06/15 12:00:00','2020/10/15 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00034','04-NS23084','2020/07/17 12:00:00','2020/07/17 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00035','01-NP23123','2020/08/13 12:00:00','2020/08/15 19:00:00',5000,N'Đã rời','BANTAI','AD00001'),
		('XE00036','43-N999999','2020/09/14 12:00:00','2020/09/15 19:00:00',5000,N'Đã rời','MOTO','AD00002'),
		('XE00037','43-N234212','2020/11/15 12:00:00','2020/11/15 19:00:00',5000,N'Đã rời','BANTAI','NV00001'),
		('XE00038','43-N683942ư','2020/11/14 12:00:00','2020/11/15 19:00:00',5000,N'Đã rời','OTOO','AD00002'),
		('XE00039','43-N312111','2020/11/12 12:00:00','2020/11/15 19:00:00',5000,N'Đã rời','BANTAI','NV00001'),
		('XE00047','03-N093214','2020/02/27 12:00:00','2020/02/10 19:00:00',5000,N'Đã rời','OTOO','AD00002'),
		('XE00048','23-NA91114','2020/02/10 12:00:00','2020/02/10 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00049','23-SA92114','2020/03/13 12:00:00','2020/03/13 19:00:00',5000,N'Đã rời','DAP','AD00001'),
		('XE00050','43-N093214','2020/04/11 12:00:00','2020/04/12 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00051','43-N093214','2020/05/12 12:00:00','2020/05/13 19:00:00',5000,N'Đã rời','DAP','NV00002'),

		

		('XE00040','43-N783786',GETDATE(),null,0,N'Đang đậu','OTOO','NV00002'),
		('XE00041','43-N183456',GETDATE(),null,0,N'Đang đậu','OTOO','NV00002'),
		('XE00042','43-Y777777',GETDATE(),null,0,N'Đang đậu','OTOO','NV00002'),
		('XE00043','43-V666666',GETDATE(),null,0,N'Đang đậu','OTOO','NV00002'),
		('XE00044','43-U555555',GETDATE(),null,0,N'Đang đậu','BANTAI','NV00002'),
		('XE00045','43-R99999',GETDATE(),null,0,N'Đang đậu','MOTO','NV00002'),
		('XE00046','79-N78356',GETDATE(),null,0,N'Đang đậu','MOTO','NV00002'),
		('XE00052','43-N093214','2022/05/12 12:00:00',null,5000,N'Đang đậu','DAP','NV00002')
----------

Select * 
from Xe 
where (idXe like '%4%') or (bienSo like '%4%') or (loaiXe like '%4%')
--hàm lấy id cho xe tiếp theo
go
create or alter function getIdXeNext
(
)
returns char(7)
as
begin
	declare @idNextInt int;
	select @idNextInt = max(right(iDXe,5))+1
	from Xe
	declare @idNextChar char(7);
	select @idNextChar = CONCAT('XE',FORMAT(@idNextInt,'D5'))
	return @idNextChar
end
go
select dbo.getIdXeNext()

--hàm lấy id cho người dùng (2 hàm: 1 ad 1 nv)tiếp theo
go
create or alter function getIdUserADNext
(
)
returns char(7)
as
begin
	declare @idNextInt int;
	select @idNextInt = max(right(idUser,5))+1
	from NguoiDung
	where chucVu='Admin'
	declare @idNextChar char(7);
	select @idNextChar = CONCAT('AD',FORMAT(@idNextInt,'D5'))
	return @idNextChar
end
go
select dbo.getIdUserADNext()

go
create or alter function getIdUserNVNext
(
)
returns char(7)
as
begin
	declare @idNextInt int;
	select @idNextInt = max(right(idUser,5))+1
	from NguoiDung
	where chucVu='User'
	declare @idNextChar char(7);
	select @idNextChar = CONCAT('NV',FORMAT(@idNextInt,'D5'))
	return @idNextChar
end
go
select dbo.getIdUserNVNext()





/*set dateformat dmy
select DATEDIFF(hour,timeVao,getdate())
from Xe
*/
go
create or alter function thanhToan
(
@id char(7)
)
returns money
as
begin
	declare @timeTongCong int
	select @timeTongCong = DATEDIFF(hour,timeVao,getdate())
	from Xe
	declare @tienLoaiXe money
	select @tienLoaiXe = donGia
	from Xe, LoaiXe
	where @id = idXe
		and loaiXe = idLoai
	declare @tienDaThu money
	select @tienDaThu = tienDaThu
	from Xe
	return @timeTongCong * @tienLoaiXe - @tienDaThu
end

--go
--select dbo.thanhToan('XE00052')