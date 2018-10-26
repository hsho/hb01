package beans;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import org.hibernate.validator.Length;
import javax.persistence.Column;
/**
* 班?
**/
@Entity
@Table(name = "HR_BANBIE")
public class BanBie {
    private java.lang.String BBNO;	//班?序?
    private java.lang.String TT1;
    private java.lang.String TT2;
    private java.lang.String TT3;
    private java.lang.String TT4;
    private java.lang.String TT5;
    private java.lang.String TT6;
    private java.lang.String YYB;
    /**
     * 取得班?序?
     * @return BBNO 班?序?
     */
    @Id
    @Column(name = "BBNO")
    public java.lang.String getBBNO() {
        return BBNO;
    }
    /**
     * 設定班?序?
     * @param BBNO 班?序?
     */
    public void setBBNO(java.lang.String BBNO) {
        this.BBNO = BBNO;
    }
    /**
     * @return TT1 
     */
    @Length(max = 4)
    @Column(name = "T1")
    public java.lang.String getTT1() {
        return TT1;
    }
    /**
     * @param TT1 
     */
    public void setTT1(java.lang.String TT1) {
        this.TT1 = TT1;
    }
    /**
     * @return TT2 
     */
    @Length(max = 4)
    @Column(name = "T2")
    public java.lang.String getTT2() {
        return TT2;
    }
    /**
     * @param TT2 
     */
    public void setTT2(java.lang.String TT2) {
        this.TT2 = TT2;
    }
    /**
     * @return TT3 
     */
    @Length(max = 4)
    @Column(name = "T3")
    public java.lang.String getTT3() {
        return TT3;
    }
    /**
     * @param TT3 
     */
    public void setTT3(java.lang.String TT3) {
        this.TT3 = TT3;
    }
    /**
     * @return TT4 
     */
    @Length(max = 4)
    @Column(name = "T4")
    public java.lang.String getTT4() {
        return TT4;
    }
    /**
     * @param TT4 
     */
    public void setTT4(java.lang.String TT4) {
        this.TT4 = TT4;
    }
    /**
     * @return TT5 
     */
    @Length(max = 4)
    @Column(name = "T5")
    public java.lang.String getTT5() {
        return TT5;
    }
    /**
     * @param TT5 
     */
    public void setTT5(java.lang.String TT5) {
        this.TT5 = TT5;
    }
    /**
     * @return TT6 
     */
    @Length(max = 4)
    @Column(name = "T6")
    public java.lang.String getTT6() {
        return TT6;
    }
    /**
     * @param TT6 
     */
    public void setTT6(java.lang.String TT6) {
        this.TT6 = TT6;
    }
    /**
     * @return YYB 
     */
    @Length(max = 1)
    @Column(name = "YB")
    public java.lang.String getYYB() {
        return YYB;
    }
    /**
     * @param YYB 
     */
    public void setYYB(java.lang.String YYB) {
        this.YYB = YYB;
    }
}
