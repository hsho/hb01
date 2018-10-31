package beans;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import org.hibernate.validator.Length;
import javax.persistence.Column;
/**
* 学历
**/
@Entity
@Table(name = "HR_XUELI")
public class XueLi {
    private java.lang.String EDCA;	//学历代号
    private java.lang.String NAME;	//学历名称
    /**
     * @return EDCA 学历代号
     */
    @Id
    @Column(name = "EDCA", length = 1)
    public java.lang.String getEDCA() {
        return EDCA;
    }
    /**
     * @param EDCA 学历代号
     */
    public void setEDCA(java.lang.String EDCA) {
        this.EDCA = EDCA;
    }
    /**
     * @return NAME 学历名称
     */
    @Length(max = 50)
    @Column(name = "NAME")
    public java.lang.String getNAME() {
        return NAME;
    }
    /**
     * @param NAME 学历名称
     */
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
}
