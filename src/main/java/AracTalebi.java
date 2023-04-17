public class AracTalebi {
    String alinacakSehir;
    String teslimEdilecekSehir;
    String alinacakGun;
    String alisSaati;
    String teslimGunu;
    String teslimSaati;

    @Override
    public String toString() {
        return "marka='" + marka + '\'' +
                "   model='" + model + '\'' +
                "   yakitTipi='" + yakitTipi + '\'' +
                "   vites='" + vites + '\'' +
                "   gunlukUcret=" + gunlukUcret ;

    }

    public AracTalebi(){

}
    public AracTalebi(String alinacakSehir, String teslimEdilecekSehir, String alinacakGun, String alisSaati, String teslimGunu, String teslimSaati) {
        this.alinacakSehir = alinacakSehir;
        this.teslimEdilecekSehir = teslimEdilecekSehir;
        this.alinacakGun = alinacakGun;
        this.alisSaati = alisSaati;
        this.teslimGunu = teslimGunu;
        this.teslimSaati = teslimSaati;
    }

    String marka;
    String model;
    String yakitTipi;
    String vites;
    double gunlukUcret;

    public AracTalebi(String marka, String model, String yakitTipi, String vites, Double gunlukUcret) {
        this.marka = marka;
        this.model = model;
        this.yakitTipi = yakitTipi;
        this.vites = vites;
        this.gunlukUcret = gunlukUcret;
    }

    public String getTeslimEdilecekSehir() {
        return teslimEdilecekSehir;
    }

    public void setTeslimEdilecekSehir(String teslimEdilecekSehir) {
        this.teslimEdilecekSehir = teslimEdilecekSehir;
    }

    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public String getAlinacakGun() {
        return alinacakGun;
    }

    public void setAlinacakGun(String alinacakGun) {
        this.alinacakGun = alinacakGun;
    }

    public String getAlisSaati() {
        return alisSaati;
    }

    public void setAlisSaati(String alisSaati) {
        this.alisSaati = alisSaati;
    }

    public String getTeslimGunu() {
        return teslimGunu;
    }

    public void setTeslimGunu(String teslimGunu) {
        this.teslimGunu = teslimGunu;
    }

    public String getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(String teslimSaati) {
        this.teslimSaati = teslimSaati;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public Double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(Double gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }


}
