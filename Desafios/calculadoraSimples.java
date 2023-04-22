public class JFcalculadora extends javax.swing.JFrame {

    public JFcalculadora() {
        initComponents();
    }
        
    //Declarando variáveis
    Double valor1, valor2;
    String sinal;
    

    private void jB0ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtResultado.setText(txtResultado.getText()+"0");
    } 

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        txtResultado.setText(txtResultado.getText()+"1");
    }                                                                           

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        txtResultado.setText(txtResultado.getText()+"2");
    }
    
    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        txtResultado.setText(txtResultado.getText()+"3");
    }

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        txtResultado.setText(txtResultado.getText()+"4");
    }                                   

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        txtResultado.setText(txtResultado.getText()+"5");
    }                                   

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        txtResultado.setText(txtResultado.getText()+"6");
    }                                   

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        txtResultado.setText(txtResultado.getText()+"7");
    }                                   

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        txtResultado.setText(txtResultado.getText()+"8");
    }                                   

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        txtResultado.setText(txtResultado.getText()+"9");
    }                                   

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {  //Botão de limpar                                        
        txtResultado.setText("");
    }                                         

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "soma";
    }
    
        private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "sub";
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "mult";
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "div";
    }      
    
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        valor2 = Double.parseDouble(txtResultado.getText());
        
        if(sinal == "soma"){
            txtResultado.setText(String.valueOf(valor1+valor2));
        } if(sinal == "sub"){
            txtResultado.setText(String.valueOf(valor1-valor2));
        } if(sinal == "mult"){
            txtResultado.setText(String.valueOf(valor1*valor2));
        } if(sinal == "div"){
            txtResultado.setText(String.valueOf(valor1/valor2));
        }
    }        
    
    }
