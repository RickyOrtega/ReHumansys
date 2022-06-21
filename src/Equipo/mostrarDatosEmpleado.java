package Equipo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class mostrarDatosEmpleado extends JFrame {

    Empleado empleado = new Empleado();
    panelModDatosEmpleado empleado1;
    public mostrarDatosEmpleado(Empleado empleado) {
        empleado1 = new panelModDatosEmpleado(this.empleado);
        empleado1.setVisible(true);
        this.empleado = empleado;
        setTitle(this.empleado.getNombreP() + " " + this.empleado.getApellidoP());
        setSize(540, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        JPanel panel = new panelModDatosEmpleado(this.empleado);

        this.add(panel);
    }
}

class panelModDatosEmpleado extends JPanel {
    private Empleado empleado;
    private Image imagen;

    public panelModDatosEmpleado(Empleado empleado) {
        JScrollPane scroll = new JScrollPane();
        scroll.setBounds(0,200,542,800);
        scroll.setVisible(true);
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        scroll.setBackground(Color.WHITE);

        this.empleado = empleado;
        setLayout(null);
        setSize(540, 720);
        setLocation(0, 0);
        setVisible(true);

        String nombres = empleado.getNombreP() + " " + empleado.getNombreS();
        String apellidos = empleado.getApellidoP() + " " + empleado.getApellidoS();

        JLabel nombreCompleto = new JLabel();
        nombreCompleto.setText(nombres.toUpperCase());
        nombreCompleto.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 30));
        nombreCompleto.setHorizontalAlignment(SwingConstants.LEFT);
        nombreCompleto.setVisible(true);
        nombreCompleto.setForeground(Color.WHITE);
        nombreCompleto.setSize(315, 30);
        nombreCompleto.setLocation(200, 60);

        JLabel apellidoCompleto = new JLabel();
        apellidoCompleto.setText(apellidos.toUpperCase());
        apellidoCompleto.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 20));
        apellidoCompleto.setHorizontalAlignment(SwingConstants.LEFT);
        apellidoCompleto.setVisible(true);
        apellidoCompleto.setForeground(Color.WHITE);
        apellidoCompleto.setSize(315, 60);
        apellidoCompleto.setLocation(200, 75);

        JLabel cargoEmpleado = new JLabel();
        cargoEmpleado.setText(String.valueOf(empleado.getCargo()));
        cargoEmpleado.setFont(new Font("Montserrat SemiBold", Font.ITALIC, 10));
        cargoEmpleado.setHorizontalAlignment(SwingConstants.LEFT);
        cargoEmpleado.setVisible(true);
        cargoEmpleado.setForeground(Color.WHITE);
        cargoEmpleado.setSize(315, 60);
        cargoEmpleado.setLocation(200, 110);

        JPanel informacion = new JPanel();
        informacion.setLayout(null);
        informacion.setSize(540, 1500);
        informacion.setLocation(0, 0);
        informacion.setBackground(Color.WHITE);
        informacion.setPreferredSize(new Dimension(540, 1110));
        informacion.setVisible(true);

        JPanel infPer = new JPanel();
        infPer.setLayout(null);
        infPer.setSize(524, 200);
        infPer.setLocation(0, 5);
        infPer.setBackground(Color.WHITE);
        infPer.setPreferredSize(new Dimension(540, 200));
        infPer.setVisible(true);
        infPer.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(116, 116, 116),1,true),"Información Personal",0,0,new Font("Montserrat SemiBold", Font.PLAIN, 20),Color.BLACK));

        JLabel cedula = new JLabel();
        cedula.setText("Cédula: " + empleado.getCedula());
        cedula.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        cedula.setHorizontalAlignment(SwingConstants.LEFT);
        cedula.setVisible(true);
        cedula.setForeground(Color.black);
        cedula.setSize(315, 60);
        cedula.setLocation(10, 20);

        JLabel fechaNacimiento = new JLabel();
        fechaNacimiento.setText("Fecha de Nacimiento: " + empleado.getDiaNacimiento() + "/" + empleado.getMesNacimiento() + "/" + empleado.getagnoNacimiento());
        fechaNacimiento.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        fechaNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
        fechaNacimiento.setVisible(true);
        fechaNacimiento.setForeground(Color.black);
        fechaNacimiento.setSize(315, 60);
        fechaNacimiento.setLocation(10, 50);

        JLabel edad = new JLabel();
        edad.setText("Edad: " + empleado.getEdad());
        edad.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        edad.setHorizontalAlignment(SwingConstants.LEFT);
        edad.setVisible(true);
        edad.setForeground(Color.black);
        edad.setSize(315, 60);
        edad.setLocation(10, 80);

        JLabel estadoCivil = new JLabel();
        estadoCivil.setText("Estado Civil: " + empleado.getEstadoCivil());
        estadoCivil.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        estadoCivil.setHorizontalAlignment(SwingConstants.LEFT);
        estadoCivil.setVisible(true);
        estadoCivil.setForeground(Color.black);
        estadoCivil.setSize(315, 60);
        estadoCivil.setLocation(10, 110);

        JLabel genero = new JLabel();
        genero.setText("Genero: " + empleado.getGenero());
        genero.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        genero.setHorizontalAlignment(SwingConstants.LEFT);
        genero.setVisible(true);
        genero.setForeground(Color.black);
        genero.setSize(315, 60);
        genero.setLocation(10, 140);

        infPer.add(cedula);
        infPer.add(fechaNacimiento);
        infPer.add(edad);
        infPer.add(estadoCivil);
        infPer.add(genero);

        informacion.add(infPer);

        JPanel infCont = new JPanel();
        infCont.setLayout(null);
        infCont.setSize(524, 230);
        infCont.setLocation(0, 205);
        infCont.setBackground(Color.WHITE);
        infCont.setPreferredSize(new Dimension(540, 200));
        infCont.setVisible(true);
        infCont.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(116, 116, 116),1,true),"Información de Contacto",0,0,new Font("Montserrat SemiBold", Font.PLAIN, 20),Color.BLACK));

        JLabel ciudad = new JLabel();
        ciudad.setText("Ciudad: " + empleado.getCiudad());
        ciudad.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        ciudad.setHorizontalAlignment(SwingConstants.LEFT);
        ciudad.setVisible(true);
        ciudad.setForeground(Color.black);
        ciudad.setSize(315, 60);
        ciudad.setLocation(10, 20);

        JLabel barrio = new JLabel();
        barrio.setText("Barrio: " + empleado.getBarrio());
        barrio.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        barrio.setHorizontalAlignment(SwingConstants.LEFT);
        barrio.setVisible(true);
        barrio.setForeground(Color.black);
        barrio.setSize(315, 60);
        barrio.setLocation(10, 50);

        JLabel direccion = new JLabel();
        direccion.setText("Dirección: " + empleado.getDireccion());
        direccion.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        direccion.setHorizontalAlignment(SwingConstants.LEFT);
        direccion.setVisible(true);
        direccion.setForeground(Color.black);
        direccion.setSize(315, 60);
        direccion.setLocation(10, 80);

        JLabel telefono = new JLabel();
        telefono.setText("Teléfono: " + empleado.getTelefono());
        telefono.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        telefono.setHorizontalAlignment(SwingConstants.LEFT);
        telefono.setVisible(true);
        telefono.setForeground(Color.black);
        telefono.setSize(315, 60);
        telefono.setLocation(10, 110);

        JLabel celular = new JLabel();
        celular.setText("Celular: " + empleado.getCelular());
        celular.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        celular.setHorizontalAlignment(SwingConstants.LEFT);
        celular.setVisible(true);
        celular.setForeground(Color.black);
        celular.setSize(315, 60);
        celular.setLocation(10, 140);

        JLabel correo = new JLabel();
        correo.setText("Email: " + empleado.getEmail());
        correo.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        correo.setHorizontalAlignment(SwingConstants.LEFT);
        correo.setVisible(true);
        correo.setForeground(Color.black);
        correo.setSize(400, 60);
        correo.setLocation(10, 170);

        infCont.add(ciudad);
        infCont.add(barrio);
        infCont.add(direccion);
        infCont.add(telefono);
        infCont.add(celular);
        infCont.add(correo);

        informacion.add(infCont);

        JPanel infEmp = new JPanel();
        infEmp.setLayout(null);
        infEmp.setSize(524, 150);
        infEmp.setLocation(0, 435);
        infEmp.setBackground(Color.WHITE);
        infEmp.setPreferredSize(new Dimension(540, 150));
        infEmp.setVisible(true);
        infEmp.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(116, 116, 116),1,true),"Información de Empleo",0,0,new Font("Montserrat SemiBold", Font.PLAIN, 20),Color.BLACK));

        JLabel cargo = new JLabel();
        cargo.setText("Cargo: " + empleado.getCargo());
        cargo.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        cargo.setHorizontalAlignment(SwingConstants.LEFT);
        cargo.setVisible(true);
        cargo.setForeground(Color.black);
        cargo.setSize(315, 60);
        cargo.setLocation(10, 20);

        JLabel fechaIngreso = new JLabel();
        fechaIngreso.setText("Fecha de Ingreso: " + empleado.getagnoIngreso() + "-" + empleado.getMesIngreso() + "-" + empleado.getDiaIngreso());
        fechaIngreso.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        fechaIngreso.setHorizontalAlignment(SwingConstants.LEFT);
        fechaIngreso.setVisible(true);
        fechaIngreso.setForeground(Color.black);
        fechaIngreso.setSize(315, 60);
        fechaIngreso.setLocation(10, 50);

        JLabel sueldo = new JLabel();
        sueldo.setText("Sueldo: " + empleado.getSueldo() + "p/H");
        sueldo.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        sueldo.setHorizontalAlignment(SwingConstants.LEFT);
        sueldo.setVisible(true);
        sueldo.setForeground(Color.black);
        sueldo.setSize(315, 60);
        sueldo.setLocation(10, 80);

        infEmp.add(cargo);
        infEmp.add(fechaIngreso);
        infEmp.add(sueldo);

        informacion.add(infEmp);

        JPanel infAcad = new JPanel();
        infAcad.setLayout(null);
        infAcad.setSize(524, 220);
        infAcad.setLocation(0, 585);
        infAcad.setBackground(Color.WHITE);
        infAcad.setPreferredSize(new Dimension(540, 220));
        infAcad.setVisible(true);
        infAcad.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(116, 116, 116),1,true),"Información Académica",0,0,new Font("Montserrat SemiBold", Font.PLAIN, 20),Color.BLACK));

        JLabel nivelAcad = new JLabel();
        nivelAcad.setText("Nivel Académico: " + empleado.getNivelAcademico());
        nivelAcad.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        nivelAcad.setHorizontalAlignment(SwingConstants.LEFT);
        nivelAcad.setVisible(true);
        nivelAcad.setForeground(Color.black);
        nivelAcad.setSize(315, 60);
        nivelAcad.setLocation(10, 20);

        JLabel carrera = new JLabel();
        carrera.setText("Carrera: " + empleado.getCarrera());
        carrera.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        carrera.setHorizontalAlignment(SwingConstants.LEFT);
        carrera.setVisible(true);
        carrera.setForeground(Color.black);
        carrera.setSize(450, 60);
        carrera.setLocation(10, 50);

        JLabel universidad = new JLabel();
        universidad.setText("Universidad: " + empleado.getUniversidad());
        universidad.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        universidad.setHorizontalAlignment(SwingConstants.LEFT);
        universidad.setVisible(true);
        universidad.setForeground(Color.black);
        universidad.setSize(500, 60);
        universidad.setLocation(10, 80);

        JLabel fechaTitulacion = new JLabel();
        fechaTitulacion.setText("Fecha de Egreso: " + empleado.getDiaEgreso() + "-" + empleado.getMesEgreso() + "-" + empleado.getMesEgreso());
        fechaTitulacion.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        fechaTitulacion.setHorizontalAlignment(SwingConstants.LEFT);
        fechaTitulacion.setVisible(true);
        fechaTitulacion.setForeground(Color.black);
        fechaTitulacion.setSize(400, 60);
        fechaTitulacion.setLocation(10, 110);

        JLabel ingles = new JLabel();
        if(empleado.isIngles() == true){
            ingles.setText("Inglés: Si");
            JLabel nivelIngles = new JLabel();
            nivelIngles.setText("Nivel: " + empleado.getNivelIngles());
            nivelIngles.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
            nivelIngles.setHorizontalAlignment(SwingConstants.LEFT);
            nivelIngles.setVisible(true);
            nivelIngles.setForeground(Color.black);
            nivelIngles.setSize(315, 60);
            nivelIngles.setLocation(10, 170);

            infAcad.add(nivelIngles);
        }else {
            ingles.setText("Inglés: No");
        }
        ingles.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 15));
        ingles.setHorizontalAlignment(SwingConstants.LEFT);
        ingles.setVisible(true);
        ingles.setForeground(Color.black);
        ingles.setSize(400, 60);
        ingles.setLocation(10, 140);


        infAcad.add(nivelAcad);
        infAcad.add(carrera);
        infAcad.add(universidad);
        infAcad.add(fechaTitulacion);
        infAcad.add(ingles);

        informacion.add(infAcad);

        scroll.setViewportView(informacion);
        this.add(apellidoCompleto);
        this.add(nombreCompleto);
        this.add(cargoEmpleado);
        this.add(scroll);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        File direccionImagen = new File(this.empleado.getFoto());
        try {
            imagen = ImageIO.read(direccionImagen);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Color colorFondoTitulo = new Color(120, 120, 120, 255);
        g2.setColor(colorFondoTitulo);
        g2.fillRect(0, 0, 540, 200);

        g2.drawImage(imagen, 25, 25, this);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(50));
        g2.setColor(colorFondoTitulo);
        g2.drawOval(0, 0, 200, 200);
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 200, 540, 200);

        //Barra trasera
        g2.setColor(new Color(255, 255, 255));
        g2.fillRect(200, 170, 100, 20);

        if(this.empleado.getIndiceS() >= 0 && this.empleado.getIndiceS() <= 24){
            g2.setColor(new Color(246, 114, 128));
        }
        if(this.empleado.getIndiceS() >= 25 && this.empleado.getIndiceS() <= 50){
            g2.setColor(new Color(240, 246, 150));
        }
        if(this.empleado.getIndiceS() >= 51 && this.empleado.getIndiceS() <= 75){
            g2.setColor(new Color(167, 233, 175));
        }
        if(this.empleado.getIndiceS() >= 76 && this.empleado.getIndiceS() <= 100){
            g2.setColor(new Color(81, 96, 145));
        }
        g2.fillRect(200, 170, this.empleado.getIndiceS(), 20);
    }
}