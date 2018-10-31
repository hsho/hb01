package beans;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
/**
* 班别
**/
@Entity
@Table(name = "HR_BANBIE")
public class BanBie {
    private java.lang.String BBNO;	//班别序号
    private java.lang.String TT1;	//时段1上班
    private java.lang.String TT2;	//时段1下班
    private java.lang.String TT3;	//时段2上班
    private java.lang.String TT4;	//时段2下班
    private java.lang.String TT5;	//时段3上班
    private java.lang.String TT6;	//时段3下班
    private java.lang.String YYB;	//是否夜班.	--'Y':夜班	'N':白班
    /**
     * 取得班别序号
     * @return BBNO 班别序号
     */
    @Id
    @Column(name = "BBNO", length = 1)
    public java.lang.String getBBNO() {
        return BBNO;
    }
    /**
     * 設定班别序号
     * @param BBNO 班别序号
     */
    public void setBBNO(java.lang.String BBNO) {
        this.BBNO = BBNO;
    }
    /**
     * @return TT1 时段1上班
     */
    @Column(name = "T1", length = 4)
    public java.lang.String getTT1() {
        return TT1;
    }
    /**
     * @param TT1 时段1上班
     */
    public void setTT1(java.lang.String TT1) {
        this.TT1 = TT1;
    }
    /**
     * @return TT2 时段1下班
     */
    @Column(name = "T2", length = 4)
    public java.lang.String getTT2() {
        return TT2;
    }
    /**
     * @param TT2 时段1下班
     */
    public void setTT2(java.lang.String TT2) {
        this.TT2 = TT2;
    }
    /**
     * @return TT3 时段2上班
     */
    @Column(name = "T3", length = 4)
    public java.lang.String getTT3() {
        return TT3;
    }
    /**
     * @param TT3 时段2上班
     */
    public void setTT3(java.lang.String TT3) {
        this.TT3 = TT3;
    }
    /**
     * @return TT4 时段2下班
     */
    @Column(name = "T4", length = 4)
    public java.lang.String getTT4() {
        return TT4;
    }
    /**
     * @param TT4 时段2下班
     */
    public void setTT4(java.lang.String TT4) {
        this.TT4 = TT4;
    }
    /**
     * @return TT5 时段3上班
     */
    @Column(name = "T5", length = 4)
    public java.lang.String getTT5() {
        return TT5;
    }
    /**
     * @param TT5 时段3上班
     */
    public void setTT5(java.lang.String TT5) {
        this.TT5 = TT5;
    }
    /**
     * @return TT6 时段3下班
     */
    @Column(name = "T6", length = 4)
    public java.lang.String getTT6() {
        return TT6;
    }
    /**
     * @param TT6 时段3下班
     */
    public void setTT6(java.lang.String TT6) {
        this.TT6 = TT6;
    }
    /**
     * @return YYB 是否夜班.	--'Y':夜班	'N':白班
     */
    @Column(name = "YB", length = 1)
    public java.lang.String getYYB() {
        return YYB;
    }
    /**
     * @param YYB 是否夜班.	--'Y':夜班	'N':白班
     */
    public void setYYB(java.lang.String YYB) {
        this.YYB = YYB;
    }
}
