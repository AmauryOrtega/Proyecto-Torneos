# Proyecto-Torneos

## Referencias

[Byes](https://www.printyourbrackets.com/how-byes-work-in-a-tournament.html).
[Ejemplos](https://www.printyourbrackets.com/seededbrackets.html).

## Correcciones

Un torneo tendra 2 mini torneos, los que perdieron contra el segundo y los que perdieron contra el primero. Asi habran 2 personas en tercer puesto.

## Ideas

### Gestionar jugadores, equipos y torneos por apps

#### App de jugadores

Una app que se encarga de crear, modificar y eliminar jugadores. Esto genera un json de un arraylist<Jugador>.

#### App de equipos

Una app que se encarga de crear, modificar y eliminar equipos. Esto genera un json de un arraylist<Equipo>.

- **Crear**: Crea todo lo relacionado de un equipo.
- **Crear desde jugadores existentes:** Carga el json de jugadores y el usuario elige cuales mete en el equipo. OJO *No borra el jugador del json de jugadores*.
- **Modificar:** Carga del json el equipo a modificar y lo actualiza.
- **Eliminar**

#### App de torneos

Una app que se encarga de crear y modificar torneos. Un json unico por torneo para permitir trabajar en otro pc sin pasar toda la informacion.

- **Crear desde jugadores existentes:** Selecciona de los jugadores que ya existen. Tiene en cuenta el sexo.
- **Crear desde equipos existentes:** Selecciona de los equipos que ya existen. Tiene en cuenta el sexo.
- **Modificar:** Aqui pueden haber muchos problemas.

### Jugar torneo

Esta seria la app que estamos haciendo, aqui se selecciona un torneo (recien creado o en progreso) y se selecciona que partido se jugara a continuacion. se juega el partido llamando a la vista kumite y se actualiza el .json de ese torneo en particular.