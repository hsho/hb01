package beans;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import org.hibernate.validator.Length;
import javax.persistence.Column;
/**
* ?位
**/
@Entity
@Table(name = "HR_XUEWEI")
public class XueWei {
    private java.lang.String DEGREE;	//?位代?
    private java.lang.String NAME;	//?位名?
    /**
     * 取得?位代?
     * @return DEGREE ?位代?
     */
    @Id
    @Column(name = "DEGREE")
    public java.lang.String getDEGREE() {
        return DEGREE;
    }
    /**
     * 設定?位代?
     * @param DEGREE ?位代?
     */
    public void setDEGREE(java.lang.String DEGREE) {
        this.DEGREE = DEGREE;
    }
    /**
     * 取得?位名?
     * @return NAME ?位名?
     */
    @Length(max = 50)
    @Column(name = "NAME")
    public java.lang.String getNAME() {
        return NAME;
    }
    /**
     * 設定?位名?
     * @param NAME ?位名?
     */
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
}
