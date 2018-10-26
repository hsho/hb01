package beans;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import org.hibernate.validator.Length;
import javax.persistence.Column;
/**
* ??
**/
@Entity
@Table(name = "HR_ZHIWU")
public class ZhiWu {
    private java.lang.String ZWNO;	//????
    private java.lang.String ZWNM;	//??名?
    private java.lang.String ZWDETAIL;	//????
    /**
     * 取得????
     * @return ZWNO ????
     */
    @Id
    @Column(name = "ZWNO")
    public java.lang.String getZWNO() {
        return ZWNO;
    }
    /**
     * 設定????
     * @param ZWNO ????
     */
    public void setZWNO(java.lang.String ZWNO) {
        this.ZWNO = ZWNO;
    }
    /**
     * 取得??名?
     * @return ZWNM ??名?
     */
    @Length(max = 100)
    @Column(name = "ZWNM")
    public java.lang.String getZWNM() {
        return ZWNM;
    }
    /**
     * 設定??名?
     * @param ZWNM ??名?
     */
    public void setZWNM(java.lang.String ZWNM) {
        this.ZWNM = ZWNM;
    }
    /**
     * 取得????
     * @return ZWDETAIL ????
     */
    @Length(max = 500)
    @Column(name = "ZWDETAIL")
    public java.lang.String getZWDETAIL() {
        return ZWDETAIL;
    }
    /**
     * 設定????
     * @param ZWDETAIL ????
     */
    public void setZWDETAIL(java.lang.String ZWDETAIL) {
        this.ZWDETAIL = ZWDETAIL;
    }
}
