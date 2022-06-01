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




use BaiGiuXe
insert into Xe(idXe,bienSo, timeVao,timeRa,tienDaThu,trangThai,loaiXe,nvThucHien)
values	('XE00001','78-S18569','2021/1/5 7:8:00','2021/1/5 7:8:00',3000,N'Đã rời','OTOO','AD00001'),
		('XE00002','78-S187899','2021/1/5 12:00:00','2021/1/5 20:00:00',3000,N'Đã rời','MOTO','AD00001'), 
		('XE00003','43-S197899','2021/1/5 12:00:00','2021/1/5 12:8:00',10000,N'Đã rời','MOTO','NV00001'),
		('XE00004','43-S187899','2021/2/9 12:00:00','2021/2/9 20:00:00',2000,N'Đã rời','OTOO','NV00001'),
		('XE00005','43-N123456','2021/2/11 12:00:00','2021/2/12 20:00:00',20000,N'Đã rời','OTOO','NV00001'),
		('XE00006','43-N783456','2021/2/15 12:00:00','2021/2/17 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00007','43-N783456','2021/2/25 12:00:00','2021/2/26 12:00:00',30000,N'Đã rời','DAP','NV00002'),
		('XE00008','43-SA23234','2022/2/02 12:00:00','2022/2/03 19:00:00',5000,N'Đã rời','MOTO','NV00001'),
		('XE00009','50-DL23211','2021/2/23 12:00:00','2021/2/25 19:00:00',5000,N'Đã rời','MOTO','NV00001'),
		('XE00010','32-S432123','2021/3/12 12:00:00','2021/3/15 19:00:00',5000,N'Đã rời','GANMAY','NV00002'),
		('XE00011','44-N423412','2021/3/22 12:00:00','2021/3/15 19:00:00',5000,N'Đã rời','MOTO','NV00002'),
		('XE00012','43-L743556','2021/3/11 12:00:00','2021/3/14 19:00:00',5000,N'Đã rời','DAP','NV00001'),
		('XE00013','43-G334356','2021/3/05 12:00:00','2021/3/13 19:00:00',5000,N'Đã rời','GANMAY','NV00002'),
		('XE00014','54-LG43476','2021/3/04 12:00:00','2021/3/15 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00015','31-DN85456','2021/3/21 12:00:00','2021/3/15 19:00:00',5000,N'Đã rời','OTOO','NV00001'),
		('XE00016','21-NE12436','2021/4/24 12:00:00','2021/4/15 19:00:00',5000,N'Đã rời','GANMAY','NV00002'),
		('XE00017','40-NA38346','2021/4/26 12:00:00','2021/4/15 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00018','23-NA78345','2021/4/27 12:00:00','2021/4/15 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00019','44-N278345','2021/4/23 12:00:00','2021/4/25 19:00:00',5000,N'Đã rời','MOTO','NV00001'),
		('XE00020','34-K383456','2021/4/12 12:00:00','2021/4/15 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00021','22-M733456','2021/5/22 12:00:00','2021/5/24 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00022','54-B743456','2021/5/30 12:00:00','2021/5/15 19:00:00',5000,N'Đã rời','BANTAI','NV00001'),
		('XE00023','43-N783456','2021/5/21 12:00:00','2021/5/25 19:00:00',5000,N'Đã rời','BANTAI','AD00002'),
		('XE00024','12-G232133','2021/5/03 12:00:00','2021/5/15 19:00:00',5000,N'Đã rời','BANTAI','AD00002'),
		('XE00025','09-J234123','2021/5/04 12:00:00','2021/5/15 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00026','09-SA41389','2021/5/05 12:00:00','2021/5/15 19:00:00',5000,N'Đã rời','DAP','NV00002'),
		('XE00027','43-PA09232','2021/6/07 12:00:00','2021/6/15 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00028','43-G954731','2021/6/06 12:00:00','2021/6/15 19:00:00',5000,N'Đã rời','MOTO','NV00002'),
		('XE00029','32-K342122','2021/7/04 12:00:00','2021/7/15 19:00:00',5000,N'Đã rời','MOTO','NV00002'),
		('XE00030','21-N433122','2021/7/04 12:00:00','2021/7/15 19:00:00',5000,N'Đã rời','BANTAI','NV00001'),
		('XE00031','43-N093214','2021/7/10 12:00:00','2021/7/10 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00032','43-N452341','2021/8/21 12:00:00','2021/8/25 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00033','43-N845732','2021/8/15 12:00:00','2021/8/15 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00034','04-NS23084','2021/8/17 12:00:00','2021/8/17 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00035','01-NP23123','2021/9/13 12:00:00','2021/9/15 19:00:00',5000,N'Đã rời','BANTAI','AD00001'),
		('XE00036','43-N999999','2021/9/14 12:00:00','2021/9/15 19:00:00',5000,N'Đã rời','MOTO','AD00002'),
		('XE00037','43-N234212','2021/9/15 12:00:00','2021/9/15 19:00:00',5000,N'Đã rời','BANTAI','NV00001'),
		('XE00038','43-N683942','2021/9/14 12:00:00','2021/9/15 19:00:00',5000,N'Đã rời','OTOO','AD00002'),
		('XE00039','43-N312111','2021/9/12 12:00:00','2021/9/15 19:00:00',5000,N'Đã rời','DAP','NV00001'),
		('XE00040','43-N312451','2021/10/12 12:00:00','2021/10/15 19:00:00',5000,N'Đã rời','BANTAI','NV00001'),
		('XE00041','43-N314711','2021/10/12 12:00:00','2021/10/15 19:00:00',5000,N'Đã rời','DAP','NV00001'),
		('XE00042','43-N312871','2021/10/12 12:00:00','2021/10/15 19:00:00',5000,N'Đã rời','BANTAI','NV00003'),
		('XE00043','43-N317841','2021/10/12 12:00:00','2021/10/15 19:00:00',5000,N'Đã rời','OTOO','NV00004'),
		('XE00044','43-N314511','2021/11/12 12:00:00','2021/11/15 19:00:00',5000,N'Đã rời','OTOO','NV00001'),
		('XE00045','43-N879911','2021/11/12 12:00:00','2021/11/15 19:00:00',5000,N'Đã rời','DAP','NV00001'),
		('XE00046','43-N378811','2021/11/12 12:00:00','2021/11/15 19:00:00',5000,N'Đã rời','OTOO','NV00001'),
		('XE00047','03-N098714','2021/12/27 12:00:00','2021/12/10 19:00:00',5000,N'Đã rời','MOTO','AD00002'),
		('XE00048','23-NA91114','2021/12/10 12:00:00','2021/12/10 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00049','23-SA92114','2021/12/13 12:00:00','2021/12/13 19:00:00',5000,N'Đã rời','DAP','AD00001'),
		('XE00050','43-N093214','2021/12/11 12:00:00','2021/12/12 19:00:00',5000,N'Đã rời','MOTO','NV00002'),
		('XE00051','43-N093214','2021/12/12 12:00:00','2021/12/13 19:00:00',5000,N'Đã rời','DAP','NV00002'),

		('XE00052','43-N094554','2022/1/12 12:00:00','2022/1/13 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00053','43-N078814','2022/1/12 12:00:00','2022/1/13 19:00:00',5000,N'Đã rời','BANTAI','NV00001'),
		('XE00054','43-N089874','2022/1/12 12:00:00','2022/1/13 19:00:00',5000,N'Đã rời','DAP','NV00001'),
		('XE00055','43-N091214','2022/2/12 12:00:00','2022/2/13 19:00:00',5000,N'Đã rời','MOTO','NV00001'),
		('XE00056','43-U465478','2022/2/12 12:00:00','2022/2/13 19:00:00',5000,N'Đã rời','GANMAY','NV00001'),
		('XE00057','43-T093214','2022/2/12 12:00:00','2022/2/13 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00058','43-T545214','2022/2/12 12:00:00','2022/2/13 19:00:00',5000,N'Đã rời','OTOO','NV00001'),
		('XE00059','43-N097814','2022/3/12 12:00:00','2022/3/13 19:00:00',5000,N'Đã rời','DAP','NV00001'),
		('XE00060','43-N741514','2022/3/12 12:00:00','2022/3/13 19:00:00',5000,N'Đã rời','MOTO','NV00001'),
		('XE00061','43-N091244','2022/3/12 12:00:00','2022/3/13 19:00:00',5000,N'Đã rời','OTOO','NV00001'),
		('XE00062','43-N045454','2022/4/12 12:00:00','2022/4/13 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00063','43-N078814','2022/4/12 12:00:00','2022/4/13 19:00:00',5000,N'Đã rời','BANTAI','NV00002'),
		('XE00064','43-N012214','2022/4/12 12:00:00','2022/4/13 19:00:00',5000,N'Đã rời','OTOO','NV00001'),
		('XE00065','43-N054414','2022/4/12 12:00:00','2022/4/13 19:00:00',5000,N'Đã rời','MOTO','NV00001'),
		('XE00066','43-N094554','2022/4/12 12:00:00','2022/4/13 19:00:00',5000,N'Đã rời','MOTO','NV00001'),
		('XE00067','43-N078814','2022/5/12 12:00:00','2022/5/13 19:00:00',5000,N'Đã rời','OTOO','NV00002'),
		('XE00068','43-N078214','2022/5/12 12:00:00','2022/5/13 19:00:00',5000,N'Đã rời','BANTAI','NV00001'),
		('XE00069','43-N785214','2022/5/12 12:00:00','2022/5/13 19:00:00',5000,N'Đã rời','DAP','NV00001'),
		('XE00070','43-N788214','2022/5/12 12:00:00','2022/5/13 19:00:00',5000,N'Đã rời','MOTO','NV00001'),

		('XE00071','43-N783786',GETDATE(),null,0,N'Đang đậu','OTOO','NV00002'),
		('XE00072','43-N183456',GETDATE(),null,0,N'Đang đậu','OTOO','NV00002'),
		('XE00073','43-Y777777',GETDATE(),null,0,N'Đang đậu','OTOO','NV00002'),
		('XE00074','43-V666666',GETDATE(),null,0,N'Đang đậu','OTOO','NV00002'),
		('XE00075','43-U555555',GETDATE(),null,0,N'Đang đậu','BANTAI','NV00002'),
		('XE00076','43-R99999',GETDATE(),null,0,N'Đang đậu','MOTO','NV00002'),
		('XE00077','79-N78356',GETDATE(),null,0,N'Đang đậu','MOTO','NV00002'),
		('XE00078','43-N093214','2022/05/12 12:00:00',null,5000,N'Đang đậu','DAP','NV00002')
----------

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
create or alter function getDoanhThuTheoQuy
(
	@nam int,
	@quy int,
	@loaixe varchar(10)
)
returns float
as
begin
	declare @tientrave float

	select @tientrave=sum(tienDaThu)
	from Xe
	where (MONTH(timeRa)=(@quy*3-2) or MONTH(timeRa)=(@quy*3-1) or MONTH(timeRa)=(@quy*3))
			and YEAR(timeRa)=@nam and trangThai=N'Đã rời' and loaiXe=@loaixe
	return @tientrave
end
go

select	dbo.getDoanhThuTheoQuy(2021,1,'OTOO'),
		dbo.getDoanhThuTheoQuy(2021,1,'MOTO'),
		dbo.getDoanhThuTheoQuy(2021,1,'BANTAI'),
		dbo.getDoanhThuTheoQuy(2021,1,'DAP'),
		dbo.getDoanhThuTheoQuy(2021,1,'GANMAY')

