package com.innovagenesis.aplicaciones.android.projectunitthree.container;

/**
 * Captura datos para el primer menu
 */

public class MenuA {

    private String txtAMenuA;
    private String txtBMenuA;
    private int imgAmenuA;
    int colorImgBGMA; // color de backgruond Imagen Menu A //

    /** Se utiliza este constructor para cambiar las propiedades del Grid*/
    public MenuA(int colorImgBGMA) {
        this.colorImgBGMA = colorImgBGMA;
    }

    public int getColorImgBGMA() {
        return colorImgBGMA;
    }

    public void setColorImgBGMA(int colorImgBGMA) {
        this.colorImgBGMA = colorImgBGMA;
    }

    /** Se utiliza este contructor para Agregar los datos al Grid*/

    public MenuA(int imgAmenuA, String txtAMenuA, String txtBMenuA) {

        this.imgAmenuA = imgAmenuA;
        this.txtAMenuA = txtAMenuA;
        this.txtBMenuA = txtBMenuA;
    }

    public int getImgAmenuA() {
        return imgAmenuA;
    }

    public void setImgAmenuA(int imgAmenuA) {
        this.imgAmenuA = imgAmenuA;
    }

    public String getTxtAMenuA() {
        return txtAMenuA;
    }

    public void setTxtAMenuA(String txtAMenuA) {
        this.txtAMenuA = txtAMenuA;
    }

    public String getTxtBMenuA() {
        return txtBMenuA;
    }

    public void setTxtBMenuA(String txtBMenuA) {
        this.txtBMenuA = txtBMenuA;
    }
}
