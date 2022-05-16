# Prueba kanteritas Kruger Corp Jessica Joya
## 💁‍♀️[LinkedIn Jessica Joya](https://www.linkedin.com/in/jessicajoya/)

## Hola! En este Readme les contare brevemente el proceso que realicé resolver la prueba.

Recibi la prueba Inventario de vacunación de empleados historias de usuario a la que llame **Kruguerianos Inminuzados**🦹🏽‍♀️ 💉 

### 📝 DATABASE
Inicie con el Data Base en el que defini 3 Tablas 
![Diagrama](https://github.com/jessicajoya/krugerianos_Inmunizados-/blob/78001c0b5eeb6e331ca43c862b553307679a1695/ResourcesReadme/ERDiagram.png?raw=true)

1. **Profile** Contiene dos columnas 
- [Profile_id] 
- [Profile_name]: sonde se almacenaran los roles, el Documento sugiere Andimistrador y empleado
2. **Users** Contiene cuatro columnas 
- [user_id]
- [user_name] : Requerido para generar usuario
- [user_password]: Requerido para generar contraseña
- [prof_id] Foering key para referenciar la tabla profile
3. **Employee** Contiene toda la informacion del krugeriano
- [user_id] [employee_dni] [employee_lastname] [employee_email]: Se marcan como NotNull debido a que es la informacion minima requeria al crear un usuario
- Las demas Columnas no son obligatorias y estan a disposicion de edicion del empleado
![EmployeeColumns](https://github.com/jessicajoya/krugerianos_Inmunizados-/blob/78001c0b5eeb6e331ca43c862b553307679a1695/ResourcesReadme/EmployeeColumns.png?raw=true)

### 🙋‍♀️BACK API REST
Continue con el API REST que maneja la logica del negocio ⏰ esta seccion me tomo la mayor cantidad de tiempo debido a que no habia trabajado con Spring🫒


1. **DTO** : Inicie con el responseDTO compuesta por 2 atributos String message y un atributo Data con tipo de dato Entity
2. **Entity** : una para cada objeto  
3. **Repository** : CRUD
4. **Service** : Contiene las funciones
5. **Controller** : Encargado de recibir las peticiones

![Sprint](https://github.com/jessicajoya/krugerianos_Inmunizados-/blob/78001c0b5eeb6e331ca43c862b553307679a1695/ResourcesReadme/sprintStructure.png?raw=true)

### 🙆‍♀️FRONT REACT
Mediante Axios realizo las peticiones HTTP 
## [Deploy GITHUB PAGES](https://jessicajoya.github.io/krugerianos_Inmunizados/) 
Muestra los botones para Crear un nuevo krugeriano employee, un boton para editar desde user Admin y un boton para editar desde user empleado, junto con un boton de eliminar.
Simulando un user que es empleado y administrador; ya que no alcance a terminar el login y los auther.

