package Equipo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.time.Year;
import java.util.Date;
import java.util.Random;

public class Equipo extends JPanel {

    private Random indice = new Random();

    public Equipo() {

        this.setSize(1400, 1200);
        this.setLocation(1920 / 8, 0);
        this.setBackground(new Color(0xD5D5D5));
        this.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 10));

        //*******************************************ADMINISTRADOR******************************************************************************

        Empleado diseñadorGrafico = new Empleado();

        //Información personal
        diseñadorGrafico.setFoto("src/Equipo/Fotos/123456789.jpg");
        diseñadorGrafico.setNombreP("Juan");
        diseñadorGrafico.setNombreS("Carlos");
        diseñadorGrafico.setApellidoP("Vásquez");
        diseñadorGrafico.setApellidoS("Sabalza");
        diseñadorGrafico.setCedula("123456789");
        diseñadorGrafico.setagnoNacimiento(1997);
        diseñadorGrafico.setMesNacimiento(10);
        diseñadorGrafico.setDiaNacimiento(02);
        diseñadorGrafico.setEdad(Year.now().getValue() - diseñadorGrafico.getagnoNacimiento());
        diseñadorGrafico.setEstadoCivil("Soltero");
        diseñadorGrafico.setGenero("Masculino");

        //Información de contacto
        diseñadorGrafico.setDireccion("Calle 1 N°1-1");
        diseñadorGrafico.setBarrio("Centro");
        diseñadorGrafico.setCiudad("Turbaco");
        diseñadorGrafico.setTelefono(6754567);
        diseñadorGrafico.setCelular("3245145515");
        diseñadorGrafico.setEmail("juanvasquezs@gmail.com");

        //Información de trabajo
        diseñadorGrafico.setCargo("Diseñador Gráfico");
        diseñadorGrafico.setagnoIngreso(2017);
        diseñadorGrafico.setMesIngreso(10);
        diseñadorGrafico.setDiaIngreso(01);
        diseñadorGrafico.setSueldo(4167);//Por hora
        diseñadorGrafico.setIndiceS(indice.nextInt(100));

        //Información académica
        diseñadorGrafico.setUniversidad("Universidad Tecnológica de Bolívar");
        diseñadorGrafico.setCarrera("Ingeniería en Civil");
        diseñadorGrafico.setNivelAcademico("Titulado en Ingeniería");
        diseñadorGrafico.setAnioEgreso(2020);
        diseñadorGrafico.setMesEgreso(10);
        diseñadorGrafico.setDiaEgreso(01);
        diseñadorGrafico.setIngles(true);
        diseñadorGrafico.setNivelIngles("B2");

        PanelEmpleado panelDiseñadorGrafico = new PanelEmpleado(diseñadorGrafico);

        this.add(panelDiseñadorGrafico);

        //*******************************************RR HH******************************************************************************
        Empleado rrhh = new Empleado();

        //Información personal
        rrhh.setFoto("src/Equipo/Fotos/104756789.jpg");
        rrhh.setNombreP("Yessica");
        rrhh.setNombreS("Paola");
        rrhh.setApellidoP("Ortega");
        rrhh.setApellidoS("Vital");
        rrhh.setCedula("104756789");
        rrhh.setagnoNacimiento(1996);
        rrhh.setMesNacimiento(1);
        rrhh.setDiaNacimiento(15);
        rrhh.setEdad(Year.now().getValue() - diseñadorGrafico.getagnoNacimiento());
        rrhh.setEstadoCivil("Casada");
        rrhh.setGenero("Femenino");

        //Información de contacto
        rrhh.setDireccion("Calle 30 N° 31a-47");
        rrhh.setBarrio("La Esperanza");
        rrhh.setCiudad("Cartagena");
        rrhh.setTelefono(6894567);
        rrhh.setCelular("3002954295");
        rrhh.setEmail("yessortega96@gmail.com");

        //Información de trabajo
        rrhh.setCargo("Recursos Humanos");
        rrhh.setagnoIngreso(2020);
        rrhh.setMesIngreso(10);
        rrhh.setDiaIngreso(30);
        rrhh.setSueldo(4167);//Por hora
        rrhh.setIndiceS(indice.nextInt(100));

        //Información académica
        rrhh.setUniversidad("Fundación Universitaria Tecnológico Comfenalco");
        rrhh.setCarrera("Gestión Turística y Hotelera");
        rrhh.setNivelAcademico("Tecnóloga");
        rrhh.setAnioEgreso(2021);
        rrhh.setMesEgreso(10);
        rrhh.setDiaEgreso(01);
        rrhh.setIngles(true);
        rrhh.setNivelIngles("B2");

        PanelEmpleado panelRRHH = new PanelEmpleado(rrhh);

        this.add(panelRRHH);

        //*******************************************DEPENDIENTE*****************************************************************************
        Empleado oficiosVarios = new Empleado();

        //Información personal
        oficiosVarios.setFoto("src/Equipo/Fotos/106358789.jpg");
        oficiosVarios.setNombreP("Marlon");
        oficiosVarios.setNombreS("David");
        oficiosVarios.setApellidoP("Gómez");
        oficiosVarios.setApellidoS("Brut");
        oficiosVarios.setCedula("106358789");
        oficiosVarios.setagnoNacimiento(1995);
        oficiosVarios.setMesNacimiento(3);
        oficiosVarios.setDiaNacimiento(22);
        oficiosVarios.setEdad(Year.now().getValue() - oficiosVarios.getagnoNacimiento());
        oficiosVarios.setEstadoCivil("Casado");
        oficiosVarios.setGenero("Masculino");

        //Información de contacto
        oficiosVarios.setDireccion("Calle 30 N° 31a-47");
        oficiosVarios.setBarrio("La Esperanza");
        oficiosVarios.setCiudad("Cartagena");
        oficiosVarios.setTelefono(6894567);
        oficiosVarios.setCelular("3178696969");
        oficiosVarios.setEmail("marlonbarriga95@gmail.com");

        //Información de trabajo
        oficiosVarios.setCargo("Oficios Varios");
        oficiosVarios.setagnoIngreso(2021);
        oficiosVarios.setMesIngreso(8);
        oficiosVarios.setDiaIngreso(15);
        oficiosVarios.setSueldo(4167);//Por hora
        oficiosVarios.setIndiceS(indice.nextInt(100));

        //Información académica
        oficiosVarios.setUniversidad("Fundación Universitaria Tecnológico Comfenalco");
        oficiosVarios.setCarrera("Gestión Turística y Hotelera");
        oficiosVarios.setNivelAcademico("Tecnólogo");
        oficiosVarios.setAnioEgreso(2020);
        oficiosVarios.setMesEgreso(12);
        oficiosVarios.setDiaEgreso(19);
        oficiosVarios.setIngles(true);
        oficiosVarios.setNivelIngles("B2");

        PanelEmpleado paneloficiosVarios = new PanelEmpleado(oficiosVarios);

        this.add(paneloficiosVarios);

//*******************************************DATA ANALYST*****************************************************************************
        Empleado dataAnalyst = new Empleado();

        //Información personal
        dataAnalyst.setFoto("src/Equipo/Fotos/1285925415.jpeg");
        dataAnalyst.setNombreP("Yeriluz");
        dataAnalyst.setNombreS("");
        dataAnalyst.setApellidoP("Manjarrez");
        dataAnalyst.setApellidoS("Hernández");
        dataAnalyst.setCedula("1285925415");
        dataAnalyst.setagnoNacimiento(1999);
        dataAnalyst.setMesNacimiento(3);
        dataAnalyst.setDiaNacimiento(22);
        dataAnalyst.setEdad(Year.now().getValue() - dataAnalyst.getagnoNacimiento());
        dataAnalyst.setEstadoCivil("Unión Libre");
        dataAnalyst.setGenero("Mujer");

        //Información de contacto
        dataAnalyst.setDireccion("Calle Sal Si puedes");
        dataAnalyst.setBarrio("Olaya");
        dataAnalyst.setCiudad("Cartagena");
        dataAnalyst.setTelefono(6892548);
        dataAnalyst.setCelular("3185262626");
        dataAnalyst.setEmail("yeriManz@gmail.com");

        //Información de trabajo
        dataAnalyst.setCargo("Data Analyst");
        dataAnalyst.setagnoIngreso(2021);
        dataAnalyst.setMesIngreso(8);
        dataAnalyst.setDiaIngreso(15);
        dataAnalyst.setSueldo(4167);//Por hora
        dataAnalyst.setIndiceS(indice.nextInt(100));

        //Información académica
        dataAnalyst.setUniversidad("Universidad de Cartagena");
        dataAnalyst.setCarrera("Biología");
        dataAnalyst.setNivelAcademico("Profesional");
        dataAnalyst.setAnioEgreso(2020);
        dataAnalyst.setMesEgreso(12);
        dataAnalyst.setDiaEgreso(19);
        dataAnalyst.setIngles(true);
        dataAnalyst.setNivelIngles("B2");

        PanelEmpleado panelDataAnalyst = new PanelEmpleado(dataAnalyst);

        this.add(panelDataAnalyst);

//*******************************************PYTHON AUDITOR*****************************************************************************
        Empleado pythonAuditor = new Empleado();

        //Información personal
        pythonAuditor.setFoto("src/Equipo/Fotos/1358279452.jpg");
        pythonAuditor.setNombreP("Esther");
        pythonAuditor.setNombreS("");
        pythonAuditor.setApellidoP("Gómez");
        pythonAuditor.setApellidoS("");
        pythonAuditor.setCedula("1358279452");
        pythonAuditor.setagnoNacimiento(1999);
        pythonAuditor.setMesNacimiento(2);
        pythonAuditor.setDiaNacimiento(22);
        pythonAuditor.setEdad(Year.now().getValue() - pythonAuditor.getagnoNacimiento());
        pythonAuditor.setEstadoCivil("Unión Libre");
        pythonAuditor.setGenero("Mujer");

        //Información de contacto
        pythonAuditor.setDireccion("Calle Sal Si puedes");
        pythonAuditor.setBarrio("Olaya");
        pythonAuditor.setCiudad("Cartagena");
        pythonAuditor.setTelefono(6892548);
        pythonAuditor.setCelular("3185262626");
        pythonAuditor.setEmail("estherGblablabla@gmail.com");

        //Información de trabajo
        pythonAuditor.setCargo("Python Auditor");
        pythonAuditor.setagnoIngreso(2021);
        pythonAuditor.setMesIngreso(8);
        pythonAuditor.setDiaIngreso(15);
        pythonAuditor.setSueldo(4167);//Por hora
        pythonAuditor.setIndiceS(indice.nextInt(100));

        //Información académica
        pythonAuditor.setUniversidad("Universidad de Cartagena");
        pythonAuditor.setCarrera("Biología");
        pythonAuditor.setNivelAcademico("Profesional");
        pythonAuditor.setAnioEgreso(2020);
        pythonAuditor.setMesEgreso(12);
        pythonAuditor.setDiaEgreso(19);
        pythonAuditor.setIngles(true);
        pythonAuditor.setNivelIngles("B2");

        PanelEmpleado panelpythonAuditor = new PanelEmpleado(pythonAuditor);

        this.add(panelpythonAuditor);

//*******************************************AUTOCAD*****************************************************************************
        Empleado AutoCAD = new Empleado();

        //Información personal
        AutoCAD.setFoto("src/Equipo/Fotos/1562859414.jpg");
        AutoCAD.setNombreP("Armando");
        AutoCAD.setNombreS("");
        AutoCAD.setApellidoP("Paredes");
        AutoCAD.setApellidoS("");
        AutoCAD.setCedula("1562859414");
        AutoCAD.setagnoNacimiento(1999);
        AutoCAD.setMesNacimiento(2);
        AutoCAD.setDiaNacimiento(22);
        AutoCAD.setEdad(Year.now().getValue() - AutoCAD.getagnoNacimiento());
        AutoCAD.setEstadoCivil("Soltero");
        AutoCAD.setGenero("Hombre");

        //Información de contacto
        AutoCAD.setDireccion("Calle Más perdi'o pa' ónde");
        AutoCAD.setBarrio("San José");
        AutoCAD.setCiudad("Cartagena");
        AutoCAD.setTelefono(6892548);
        AutoCAD.setCelular("3183256585");
        AutoCAD.setEmail("armanditoelconstructor@gmail.com");

        //Información de trabajo
        AutoCAD.setCargo("AutoCAD");
        AutoCAD.setagnoIngreso(2021);
        AutoCAD.setMesIngreso(8);
        AutoCAD.setDiaIngreso(15);
        AutoCAD.setSueldo(4167);//Por hora
        AutoCAD.setIndiceS(indice.nextInt(100));

        //Información académica
        AutoCAD.setUniversidad("Universidad de Cartagena");
        AutoCAD.setCarrera("Ingeniero Civil");
        AutoCAD.setNivelAcademico("Profesional");
        AutoCAD.setAnioEgreso(2020);
        AutoCAD.setMesEgreso(12);
        AutoCAD.setDiaEgreso(19);
        AutoCAD.setIngles(true);
        AutoCAD.setNivelIngles("B2");

        PanelEmpleado panelAutoCAD = new PanelEmpleado(AutoCAD);

        this.add(panelAutoCAD);

        //*******************************************ingenieroDeAudio*****************************************************************************
        Empleado ingenieroDeAudio = new Empleado();

        //Información personal
        ingenieroDeAudio.setFoto("src/Equipo/Fotos/1358456321.jpg");
        ingenieroDeAudio.setNombreP("Weider");
        ingenieroDeAudio.setNombreS("");
        ingenieroDeAudio.setApellidoP("Navarro");
        ingenieroDeAudio.setApellidoS("");
        ingenieroDeAudio.setCedula("1358456321");
        ingenieroDeAudio.setagnoNacimiento(1999);
        ingenieroDeAudio.setMesNacimiento(2);
        ingenieroDeAudio.setDiaNacimiento(22);
        ingenieroDeAudio.setEdad(Year.now().getValue() - ingenieroDeAudio.getagnoNacimiento());
        ingenieroDeAudio.setEstadoCivil("Soltero");
        ingenieroDeAudio.setGenero("Hombre");

        //Información de contacto
        ingenieroDeAudio.setDireccion("Calle Más perdi'o pa' ónde");
        ingenieroDeAudio.setBarrio("San José");
        ingenieroDeAudio.setCiudad("Cartagena");
        ingenieroDeAudio.setTelefono(6892548);
        ingenieroDeAudio.setCelular("3183256585");
        ingenieroDeAudio.setEmail("ingweider@gmail.com");

        //Información de trabajo
        ingenieroDeAudio.setCargo("Ingeniero De Audio");
        ingenieroDeAudio.setagnoIngreso(2021);
        ingenieroDeAudio.setMesIngreso(8);
        ingenieroDeAudio.setDiaIngreso(15);
        ingenieroDeAudio.setSueldo(4167);//Por hora
        ingenieroDeAudio.setIndiceS(indice.nextInt(100));

        //Información académica
        ingenieroDeAudio.setUniversidad("Universidad de Cartagena");
        ingenieroDeAudio.setCarrera("Ingeniero Civil");
        ingenieroDeAudio.setNivelAcademico("Profesional");
        ingenieroDeAudio.setAnioEgreso(2020);
        ingenieroDeAudio.setMesEgreso(12);
        ingenieroDeAudio.setDiaEgreso(19);
        ingenieroDeAudio.setIngles(true);
        ingenieroDeAudio.setNivelIngles("B2");

        PanelEmpleado panelIngenieroDeAudio = new PanelEmpleado(ingenieroDeAudio);

        this.add(panelIngenieroDeAudio);

//*******************************************COMUNICADOR SOCIAL*****************************************************************************
        Empleado jefeDeComunicaciones = new Empleado();

        //Información personal
        jefeDeComunicaciones.setFoto("src/Equipo/Fotos/1558992634.jpg");
        jefeDeComunicaciones.setNombreP("Jey");
        jefeDeComunicaciones.setNombreS("");
        jefeDeComunicaciones.setApellidoP("Calvo");
        jefeDeComunicaciones.setApellidoS("");
        jefeDeComunicaciones.setCedula("1558992634");
        jefeDeComunicaciones.setagnoNacimiento(1999);
        jefeDeComunicaciones.setMesNacimiento(2);
        jefeDeComunicaciones.setDiaNacimiento(22);
        jefeDeComunicaciones.setEdad(Year.now().getValue() - jefeDeComunicaciones.getagnoNacimiento());
        jefeDeComunicaciones.setEstadoCivil("Soltero");
        jefeDeComunicaciones.setGenero("Hombre");

        //Información de contacto
        jefeDeComunicaciones.setDireccion("Calle Más perdi'o pa' ónde");
        jefeDeComunicaciones.setBarrio("Sabrá");
        jefeDeComunicaciones.setCiudad("Turbana");
        jefeDeComunicaciones.setTelefono(6892548);
        jefeDeComunicaciones.setCelular("3183256585");
        jefeDeComunicaciones.setEmail("jComunication@gmail.com");

        //Información de trabajo
        jefeDeComunicaciones.setCargo("Jefe de Comunicaciones");
        jefeDeComunicaciones.setagnoIngreso(2021);
        jefeDeComunicaciones.setMesIngreso(8);
        jefeDeComunicaciones.setDiaIngreso(15);
        jefeDeComunicaciones.setSueldo(4167);//Por hora
        jefeDeComunicaciones.setIndiceS(indice.nextInt(100));

        //Información académica
        jefeDeComunicaciones.setUniversidad("Universidad de Cartagena");
        jefeDeComunicaciones.setCarrera("Comunicador Social");
        jefeDeComunicaciones.setNivelAcademico("Profesional");
        jefeDeComunicaciones.setAnioEgreso(2020);
        jefeDeComunicaciones.setMesEgreso(12);
        jefeDeComunicaciones.setDiaEgreso(19);
        jefeDeComunicaciones.setIngles(true);
        jefeDeComunicaciones.setNivelIngles("B2");

        PanelEmpleado panelJefeDeComunicaciones = new PanelEmpleado(jefeDeComunicaciones);

        this.add(panelJefeDeComunicaciones);

//******************************************* JEFE DE RELACIONES EXTERIORES *****************************************************************************
        Empleado jefeDeRelacionesExteriores = new Empleado();

        //Información personal
        jefeDeRelacionesExteriores.setFoto("src/Equipo/Fotos/1056256321.jpg");
        jefeDeRelacionesExteriores.setNombreP("Evelyn");
        jefeDeRelacionesExteriores.setNombreS("");
        jefeDeRelacionesExteriores.setApellidoP("Ortega");
        jefeDeRelacionesExteriores.setApellidoS("Atencia");
        jefeDeRelacionesExteriores.setCedula("1056256321");
        jefeDeRelacionesExteriores.setagnoNacimiento(1999);
        jefeDeRelacionesExteriores.setMesNacimiento(2);
        jefeDeRelacionesExteriores.setDiaNacimiento(22);
        jefeDeRelacionesExteriores.setEdad(Year.now().getValue() - jefeDeRelacionesExteriores.getagnoNacimiento());
        jefeDeRelacionesExteriores.setEstadoCivil("Unión Libre");
        jefeDeRelacionesExteriores.setGenero("Mujer");

        //Información de contacto
        jefeDeRelacionesExteriores.setDireccion("Calle 56 N° 42-24");
        jefeDeRelacionesExteriores.setBarrio("Sabrá");
        jefeDeRelacionesExteriores.setCiudad("Turbana");
        jefeDeRelacionesExteriores.setTelefono(6892548);
        jefeDeRelacionesExteriores.setCelular("3183256585");
        jefeDeRelacionesExteriores.setEmail("jComunication@gmail.com");

        //Información de trabajo
        jefeDeRelacionesExteriores.setCargo("Jefe de Comunicaciones");
        jefeDeRelacionesExteriores.setagnoIngreso(2021);
        jefeDeRelacionesExteriores.setMesIngreso(8);
        jefeDeRelacionesExteriores.setDiaIngreso(15);
        jefeDeRelacionesExteriores.setSueldo(4167);//Por hora
        jefeDeRelacionesExteriores.setIndiceS(indice.nextInt(100));

        //Información académica
        jefeDeRelacionesExteriores.setUniversidad("Universidad de Cartagena");
        jefeDeRelacionesExteriores.setCarrera("Comunicador Social");
        jefeDeRelacionesExteriores.setNivelAcademico("Profesional");
        jefeDeRelacionesExteriores.setAnioEgreso(2020);
        jefeDeRelacionesExteriores.setMesEgreso(12);
        jefeDeRelacionesExteriores.setDiaEgreso(19);
        jefeDeRelacionesExteriores.setIngles(true);
        jefeDeRelacionesExteriores.setNivelIngles("B2");

        PanelEmpleado panelJefeDeRelacionesExteriores = new PanelEmpleado(jefeDeRelacionesExteriores);

        this.add(panelJefeDeRelacionesExteriores);

//*******************************************REDES SOCIALES*****************************************************************************
        Empleado administradorRedesSocial = new Empleado();

        //Información personal
        administradorRedesSocial.setFoto("src/Equipo/Fotos/1043968421.jpg");
        administradorRedesSocial.setNombreP("Ronaldinho");
        administradorRedesSocial.setNombreS("");
        administradorRedesSocial.setApellidoP("Ortega");
        administradorRedesSocial.setApellidoS("Ruíz");
        administradorRedesSocial.setCedula("1043968421");
        administradorRedesSocial.setagnoNacimiento(1999);
        administradorRedesSocial.setMesNacimiento(2);
        administradorRedesSocial.setDiaNacimiento(22);
        administradorRedesSocial.setEdad(Year.now().getValue() - administradorRedesSocial.getagnoNacimiento());
        administradorRedesSocial.setEstadoCivil("Soltero");
        administradorRedesSocial.setGenero("Masculino");

        //Información de contacto
        administradorRedesSocial.setDireccion("Calle 30 N° 31a-47");
        administradorRedesSocial.setBarrio("La Esperanza");
        administradorRedesSocial.setCiudad("Cartagena");
        administradorRedesSocial.setTelefono(6892548);
        administradorRedesSocial.setCelular("3586859685");
        administradorRedesSocial.setEmail("ingenierorrss@gmail.com");

        //Información de trabajo
        administradorRedesSocial.setCargo("Administrador de Redes Sociales");
        administradorRedesSocial.setagnoIngreso(2021);
        administradorRedesSocial.setMesIngreso(8);
        administradorRedesSocial.setDiaIngreso(15);
        administradorRedesSocial.setSueldo(4167);//Por hora
        administradorRedesSocial.setIndiceS(indice.nextInt(100));

        //Información académica
        administradorRedesSocial.setUniversidad("Fundación Universitaria Los Libertadores");
        administradorRedesSocial.setCarrera("Ingeniería en Sistemas Computacionales");
        administradorRedesSocial.setNivelAcademico("Profesional");
        administradorRedesSocial.setAnioEgreso(2020);
        administradorRedesSocial.setMesEgreso(12);
        administradorRedesSocial.setDiaEgreso(19);
        administradorRedesSocial.setIngles(true);
        administradorRedesSocial.setNivelIngles("B2");

        PanelEmpleado paneladministradorRedesSocial = new PanelEmpleado(administradorRedesSocial);

        this.add(paneladministradorRedesSocial);
    }
}

class PanelEmpleado extends JPanel {
    private Empleado empleado;

    private Image imagen;

    private mostrarDatosEmpleado ventanaEmergente;

    public PanelEmpleado(Empleado empleado) {

        this.empleado = empleado;
        setBorder(BorderFactory.createEmptyBorder());
        setBackground(Color.WHITE);
        setLayout(null);
        setSize(300, 300);
        setPreferredSize(new Dimension(300, 300));

        JLabel Nombre = new JLabel();
        Nombre.setFont(new Font("Montserrat SemiBold", Font.BOLD, 20));
        Nombre.setText(empleado.getNombreP() + " " + empleado.getApellidoP());
        Nombre.setForeground(Color.BLACK);
        Nombre.setSize(300, 24);
        Nombre.setLocation(0, 190);
        Nombre.setVisible(true);
        Nombre.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel Cargo = new JLabel();
        Cargo.setFont(new Font("Montserrat SemiBold", Font.ITALIC, 10));
        Cargo.setText(empleado.getCargo());
        Cargo.setForeground(Color.BLACK);
        Cargo.setSize(300, 20);
        Cargo.setLocation(0, 220);
        Cargo.setVisible(true);
        Cargo.setHorizontalAlignment(SwingConstants.CENTER);

        add(Nombre);
        add(Cargo);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaEmergente = new mostrarDatosEmpleado(empleado);
                ventanaEmergente.setVisible(true);
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        File direccionImagen = new File(empleado.getFoto());
        try {
            imagen = ImageIO.read(direccionImagen);
        } catch (IOException e) {
            System.out.println("Error al cargar la imagen");
        }
        g2.drawImage(imagen, 75, 25, this);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(50));
        g2.setColor(Color.WHITE);
        g2.drawOval(50, 0, 200, 200);
    }
}