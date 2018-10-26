package beans;
import javax.persistence.IdClass;
import beans.pk.BuMenZhiWuPk;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
/**
* 部???
**/
@IdClass(BuMenZhiWuPk.class)
@Entity
@Table(name = "HR_BUMEN_ZHIWU")
public class BuMenZhiWu {
    private java.lang.String BMNO;	//部???
    private java.lang.String ZWNO;	//????
    /**
     * 取得部???
     * @return BMNO 部???
     */
    @Id
    public java.lang.String getBMNO() {
        return BMNO;
    }
    /**
     * 設定部???
     * @param BMNO 部???
     */
    public void setBMNO(java.lang.String BMNO) {
        this.BMNO = BMNO;
    }
    /**
     * 取得????
     * @return ZWNO ????
     */
    @Id
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
    private BuMen BMNO_Object;
    /**
     * 取得部???
     * @return BMNO 部???
     */
    @ManyToOne
    @JoinColumn(name="BMNO", referencedColumnName="BMNO", insertable=false, updatable=false)
    @NotFound(action=NotFoundAction.IGNORE)
    public BuMen getBMNO_Object() {
        return BMNO_Object;
    }
    /**
     * 設定部???
     * @param BMNO 部???
     */
    public void setBMNO_Object(BuMen BMNO) {
        this.BMNO_Object = BMNO;
    }
    private ZhiWu ZWNO_Object;
    /**
     * 取得????
     * @return ZWNO ????
     */
    @ManyToOne
    @JoinColumn(name="ZWNO", referencedColumnName="ZWNO", insertable=false, updatable=false)
    @NotFound(action=NotFoundAction.IGNORE)
    public ZhiWu getZWNO_Object() {
        return ZWNO_Object;
    }
    /**
     * 設定????
     * @param ZWNO ????
     */
    public void setZWNO_Object(ZhiWu ZWNO) {
        this.ZWNO_Object = ZWNO;
    }
}
