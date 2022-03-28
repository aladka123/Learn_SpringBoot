package vn.techmaster.bt2.Model;

public enum location {
    HaNoi("Ha Noi") , 
    HaiPhong("Hai Phong"),
    DaNang("Da Nang"),
    HoChiMinh("Ho Chi Minh");

    private String value;
 
    private location(String value) {
        this.value = value;
    }

    public String des(){
        return this.value;
    }
}
