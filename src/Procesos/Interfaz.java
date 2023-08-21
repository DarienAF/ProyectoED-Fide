
package Procesos;

import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Interfaz extends javax.swing.JFrame {
    private Timer timer;
    private int minutes = 5;
    private int seconds = 0;
    private boolean inicio = false;  
    private int totalPoints = 0;
    private DatosManager datosManager;
    
     String name = JOptionPane.showInputDialog(this, 
     "Jugador ingrese su nombre:");
    
    // Lista auxiliar para almacenar los ingredientes seleccionados
     private List<String> listaAuxiliar = new ArrayList<>(4);
    
    // Agregar una variable para la instancia de ListaC
    private ListaC listaC;

    // Mapa para asociar los Strings con las imágenes correspondientes
    private Map<String, ImageIcon> imagenesMap;
    
    // Instanciar la cola
    private Cola cola = new Cola();
    
    public Interfaz() {
        initComponents();
        cargarImagenes();
        listaC = new ListaC(); 
        actualizarIngrediente(); 
        listaAuxiliar = new ArrayList<>(); 
        cola.generarOrdenesAleatorias();

        datosManager = new DatosManager();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        btnReglas = new javax.swing.JButton();
        btnResultados = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        tiempo = new javax.swing.JLabel();
        blnTime = new javax.swing.JLabel();
        btnMover = new javax.swing.JButton();
        btnContrario = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        btnComparar = new javax.swing.JButton();
        blnIngrediente1 = new javax.swing.JLabel();
        labelIngrediente1 = new javax.swing.JLabel();
        labelIngrediente2 = new javax.swing.JLabel();
        labelIngrediente3 = new javax.swing.JLabel();
        lblTrash = new javax.swing.JLabel();
        labelIngrediente4 = new javax.swing.JLabel();
        btnBasurero = new javax.swing.JButton();
        lblTipoH = new javax.swing.JLabel();
        lblPuntos = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        LabelScore = new javax.swing.JLabel();
        lblPoints = new javax.swing.JLabel();
        mesa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReglas.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        btnReglas.setText("REGLAS");
        btnReglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReglasActionPerformed(evt);
            }
        });
        bg.add(btnReglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 200, 50));

        btnResultados.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        btnResultados.setText("Resultados");
        btnResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadosActionPerformed(evt);
            }
        });
        bg.add(btnResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 200, 50));

        btnStart.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        btnStart.setText("JUGAR");
        btnStart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        bg.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 200, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FondoN.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        bg.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 330, 590));

        tiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reloj.png"))); // NOI18N
        tiempo.setText("jLabel4");
        bg.add(tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 110, 110));

        blnTime.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        blnTime.setText("5:00");
        bg.add(blnTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

        btnMover.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMover.setText(">");
        btnMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoverActionPerformed(evt);
            }
        });
        bg.add(btnMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, -1, -1));

        btnContrario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnContrario.setText("<");
        btnContrario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContrarioActionPerformed(evt);
            }
        });
        bg.add(btnContrario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        btnSeleccionar.setText("SELECCIONAR");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        bg.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        btnComparar.setText("COMPARAR");
        btnComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompararActionPerformed(evt);
            }
        });
        bg.add(btnComparar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 110, -1));
        bg.add(blnIngrediente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 100, 90));

        labelIngrediente1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        labelIngrediente1.setForeground(new java.awt.Color(255, 51, 0));
        labelIngrediente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIngrediente1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 1, true));
        bg.add(labelIngrediente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 100, 90));

        labelIngrediente2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        labelIngrediente2.setForeground(new java.awt.Color(255, 51, 0));
        labelIngrediente2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIngrediente2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        bg.add(labelIngrediente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 100, 90));

        labelIngrediente3.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        labelIngrediente3.setForeground(new java.awt.Color(255, 51, 0));
        labelIngrediente3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIngrediente3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 1, true));
        bg.add(labelIngrediente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 100, 90));

        lblTrash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash.png"))); // NOI18N
        bg.add(lblTrash, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 60, -1));

        labelIngrediente4.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        labelIngrediente4.setForeground(new java.awt.Color(255, 51, 0));
        labelIngrediente4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIngrediente4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 1, true));
        bg.add(labelIngrediente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, 100, 90));

        btnBasurero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBasureroActionPerformed(evt);
            }
        });
        bg.add(btnBasurero, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 60, 80));

        lblTipoH.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        lblTipoH.setForeground(new java.awt.Color(255, 51, 0));
        bg.add(lblTipoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 280, 30));

        lblPuntos.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        lblPuntos.setForeground(new java.awt.Color(255, 51, 0));
        bg.add(lblPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 70, 20));

        lbl1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 90, 20));

        lbl2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 90, 20));

        lbl3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 90, 20));

        lbl4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, 90, 20));

        LabelScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/score.png"))); // NOI18N
        bg.add(LabelScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        lblPoints.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        lblPoints.setForeground(new java.awt.Color(204, 153, 0));
        lblPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.add(lblPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 90, 40));

        mesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FONDO.jpg"))); // NOI18N
        mesa.setText("jLabel2");
        bg.add(mesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 680, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //
    //
     // Método para actualizar el JLabel
    private void actualizarIngrediente() {
    String ingredienteActual = listaC.getIngredienteActual();

    // Configurar ingrediente con la imagen correspondiente
    ImageIcon imagenIngrediente = imagenesMap.get(ingredienteActual);
    blnIngrediente1.setIcon(imagenIngrediente);

    // Actualizar el texto del JLabel con el nombre del ingrediente
    blnIngrediente1.setText("");
    
}
    
    private void compararListas() {
    Orden ordenFrente = cola.obtenerDatos();

    if (ordenFrente != null) {
        List<String> ingredientesOrdenFrente = ordenFrente.getIngredientesR();

        if (listaAuxiliar.equals(ingredientesOrdenFrente)) {

            JOptionPane.showMessageDialog(this, "¡Felicidades! "
            + "La lista de ingredientes es correcta.");
 
            int puntosOrdenFrente = cola.obtenerPuntosOrdenFrente();
            totalPoints += puntosOrdenFrente;

            lblPoints.setText("" + totalPoints);

            cola.atiende();
            
            Orden ordenFrente2 = cola.obtenerDatos();        
                
    if (ordenFrente2 != null) {
        // Obtener los datos de la orden
        String tipoHamburguesa = ordenFrente2.getTipoHamburguesa();
        int puntos = ordenFrente2.getPuntos();
        List<String> ingredientes = ordenFrente2.getIngredientesR();

        // Actualizar los labels con los datos obtenidos
        lblTipoH.setText(tipoHamburguesa);
        lblPuntos.setText("PUNTOS: " + puntos);
        
        // Actualizar los labels de los ingredientes 
        lbl1.setText(ingredientes.size() >= 1 ? ingredientes.get(0) : "");
        lbl2.setText(ingredientes.size() >= 2 ? ingredientes.get(1) : "");
        lbl3.setText(ingredientes.size() >= 3 ? ingredientes.get(2) : "");
        lbl4.setText(ingredientes.size() >= 4 ? ingredientes.get(3) : "");
    } else {
        JOptionPane.showMessageDialog(this, "La cola está vacía.");
    } 
        } else {

            JOptionPane.showMessageDialog(this, "La lista de ingredientes no "
             + "coincide con la orden.");
        }

        listaAuxiliar.clear();

        labelIngrediente1.setText("");
        labelIngrediente2.setText("");
        labelIngrediente3.setText("");
        labelIngrediente4.setText("");
        
    } else {

        JOptionPane.showMessageDialog(this, "La cola está vacía. "
        + "No hay órdenes para comparar.");
    }
}
    private void cargarImagenes() {
    imagenesMap = new HashMap<>();//HashMap para almacenar las imágenes

    // Cargar imagen de la hamburguesa
    ImageIcon imagenHamburguesa = new ImageIcon(getClass().getResource
    ("/img/hamburguesa.png"));
    imagenesMap.put("Hamburguesa", imagenHamburguesa);
    
    ImageIcon imagenCarne = new ImageIcon(getClass().getResource
    ("/img/carne.png"));
    imagenesMap.put("Carne", imagenCarne);

    ImageIcon imagenLechuga = new ImageIcon(getClass().getResource
    ("/img/lechuga.png"));
    imagenesMap.put("Lechuga", imagenLechuga);

    ImageIcon imagenQueso = new ImageIcon(getClass().getResource
    ("/img/queso.png"));
    imagenesMap.put("Queso", imagenQueso);

    ImageIcon imagenPan = new ImageIcon(getClass().getResource
    ("/img/pan.png"));
    imagenesMap.put("Pan", imagenPan);

    // Cargar imagen de la bomba
    ImageIcon imagenBomb = new ImageIcon(getClass().getResource
    ("/img/bomba.png"));
    
    imagenesMap.put("Ingrediente Especial", imagenBomb);
}
    //
    //
    private void btnReglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReglasActionPerformed
        JOptionPane.showMessageDialog(this, 
 "-------------------------REGLAS DE LA COCINA-------------------------\n"
+ "1- Prepárate para cocinar, sin pulsar Start nada podrás preparar\n"
+ "2- En este juego de destreza y sazon, evita la bomba con precaución.\n"
+ "3- No debes temer, reiniciar el juego es lo mejor a hacer\n"
+ "4- Sigue la receta sin improvisar y deliciosas hamburguesa podrás crear.\n"
+ "5- Si el esfuerzo buscas inmortalizar, cinco minutos tendrás que esperar.\n"
+ "6- Entre cada orden veinte segundos de espera, "
+ "son la clave para la clientela");
    }//GEN-LAST:event_btnReglasActionPerformed

    private void btnResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadosActionPerformed
        String datos = datosManager.leerDatos();

        if (datos.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
            "No hay datos en el archivo Resultados.txt.");
        } else {
            JOptionPane.showMessageDialog(this, 
            "RESULTADOS:\n" + datos);
        }
    }//GEN-LAST:event_btnResultadosActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        //Inicio de cronometro
        if (timer == null || !timer.isRunning()) {
            timer = new Timer(1000, new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (minutes == 0 && seconds == 0) {
                        timer.stop();
                        JOptionPane.showMessageDialog(Interfaz.this, 
                        "¡Tiempo terminado!");
                        
                        // Guardar los datos cuando el temporizador finalice
                             datosManager.guardarDatos(name, totalPoints);
                            
                    } else {
                        if (seconds == 0) {
                            minutes--;
                            seconds = 59;
                        } else {
                            seconds--;
                        }
                        blnTime.setText(String.format("%d:%02d", minutes, 
                        seconds));
                    }
                }
            });
            timer.start();
            inicio = true;
            //
     //Datos de Orden       
     Orden ordenFrente = cola.obtenerDatos();
     
    
    if (ordenFrente != null) {
        
        // Obtener los datos de la orden
        String tipoHamburguesa = ordenFrente.getTipoHamburguesa();
        int puntos = ordenFrente.getPuntos();
        List<String> ingredientes = ordenFrente.getIngredientesR();

        // Actualizar los labels 
        lblTipoH.setText(tipoHamburguesa);
        lblPuntos.setText("PUNTOS: " + puntos);
        
        // Actualiza el texto de lbl1 con el primer ingrediente si hay 
        //al menos un ingrediente en la lista ingredientes
        //de lo contrario, establece el texto en una cadena vacía
        lbl1.setText(ingredientes.size() >= 1 ? ingredientes.get(0) : "");
        lbl2.setText(ingredientes.size() >= 2 ? ingredientes.get(1) : "");
        lbl3.setText(ingredientes.size() >= 3 ? ingredientes.get(2) : "");
        lbl4.setText(ingredientes.size() >= 4 ? ingredientes.get(3) : "");
    } else {
        
        JOptionPane.showMessageDialog(this, "La cola está vacía. ");
    }    
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoverActionPerformed
        if (!inicio) {
        JOptionPane.showMessageDialog(this, "El juego no ha sido iniciado.");
    } else {
        listaC.mueveCinta();
        actualizarIngrediente(); 
         }
    }//GEN-LAST:event_btnMoverActionPerformed

    private void btnContrarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContrarioActionPerformed
        if (!inicio) {
        JOptionPane.showMessageDialog(this, "El juego no ha sido iniciado. ");
    } else {
        listaC.mueveCintaContrario(); 
        actualizarIngrediente();
         }
    }//GEN-LAST:event_btnContrarioActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        if (!inicio) {
        JOptionPane.showMessageDialog(this, "El juego no ha sido iniciado.");
    } else {
        String ingrediente;
        ingrediente = listaC.seleccionarIngrediente();
        listaC.rellenarCinta();
        actualizarIngrediente(); // Actualizar el JLabel de ingrediente 

        // Verificar si el ingrediente es Ingrediente Especial
        if (ingrediente.equals("Ingrediente Especial")) {

            if (timer != null && timer.isRunning()) {
                timer.stop();
            }
            // Establecer inicio como false
            inicio = false;
            JOptionPane.showMessageDialog(this, "Haz explotado la cocina, "
            + "reinicia el juego.");
            System.exit(0);
            
        } else {
            
            if (listaAuxiliar.size() < 4) {
                listaAuxiliar.add(ingrediente);
            } else {

                JOptionPane.showMessageDialog(this, "La lista de ingredientes "
                + "ya contiene 4 elementos.");
            }

            // Actualizar las etiquetas con los ingredientes seleccionados
            labelIngrediente1.setText(listaAuxiliar.size() >= 1 
            ? listaAuxiliar.get(0) : "");
            
            labelIngrediente2.setText(listaAuxiliar.size() >= 2 
            ? listaAuxiliar.get(1) : "");
            
            labelIngrediente3.setText(listaAuxiliar.size() >= 3 
            ? listaAuxiliar.get(2) : "");
            
            labelIngrediente4.setText(listaAuxiliar.size() >= 4 
            ? listaAuxiliar.get(3) : "");
        }
    }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompararActionPerformed
         if (!inicio) {
        JOptionPane.showMessageDialog(this, "El juego no ha sido iniciado.");
    } else {
            compararListas();

       // Actualizar las etiquetas 
       labelIngrediente1.setIcon(null);
       labelIngrediente2.setIcon(null);
       labelIngrediente3.setIcon(null);
       labelIngrediente4.setIcon(null);
     }
    }//GEN-LAST:event_btnCompararActionPerformed

    private void btnBasureroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBasureroActionPerformed
        if (!inicio) {
        JOptionPane.showMessageDialog(this, "El juego no ha sido iniciado.");
    } else {

        String ingredienteActual = listaC.getIngredienteActual();

        listaC.eliminarIngredienteActual();

        listaC.rellenarCinta();

        actualizarIngrediente();

        if (ingredienteActual.equals("Ingrediente Especial")) {
            // Finalizar el temporizador de inmediato
            timer.setInitialDelay(0);
            if (timer != null && timer.isRunning()) {
                timer.stop();
                
            }

            inicio = false;
            JOptionPane.showMessageDialog(this, "Haz explotado la cocina, "
            + "reinicia el juego.");
            System.exit(0);
        }
    }
    }//GEN-LAST:event_btnBasureroActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelScore;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel blnIngrediente1;
    private javax.swing.JLabel blnTime;
    private javax.swing.JButton btnBasurero;
    private javax.swing.JButton btnComparar;
    private javax.swing.JButton btnContrario;
    private javax.swing.JButton btnMover;
    private javax.swing.JButton btnReglas;
    private javax.swing.JButton btnResultados;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel labelIngrediente1;
    private javax.swing.JLabel labelIngrediente2;
    private javax.swing.JLabel labelIngrediente3;
    private javax.swing.JLabel labelIngrediente4;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lblPoints;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblTipoH;
    private javax.swing.JLabel lblTrash;
    private javax.swing.JLabel mesa;
    private javax.swing.JLabel tiempo;
    // End of variables declaration//GEN-END:variables
}
