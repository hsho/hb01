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
* 部门职务
**/
@IdClass(BuMenZhiWuPk.class)
@Entity
@Table(name = "HR_BUMEN_ZHIWU")
public class BuMenZhiWu {
    private java.lang.String BMNO;	//部门编号
    private java.lang.String ZWNO;	//职务编号
    /**
     * @return BMNO 部门编号
     */
    @Id
//    @Column(name = "BMNO")
//    @Length(max = 10)
    public java.lang.String getBMNO() {
        return BMNO;
    }
    /**
     * @param BMNO 部门编号
     */
    public void setBMNO(java.lang.String BMNO) {
        this.BMNO = BMNO;
    }
    /**
     * @return ZWNO 职务编号
     */
    @Id
//    @Column(name = "ZWNO")
//    @Length(max = 10)
    public java.lang.String getZWNO() {
        return ZWNO;
    }
    /**
     * @param ZWNO 职务编号
     */
    public void setZWNO(java.lang.String ZWNO) {
        this.ZWNO = ZWNO;
    }
    
    
    private BuMen bumen;	//部门
    /**
     * @return bumen 部门
     */
    @ManyToOne
    @JoinColumn(name="BMNO", referencedColumnName="BMNO", insertable=false, updatable=false)
    @NotFound(action=NotFoundAction.IGNORE)
    public BuMen getBumen() {
        return bumen;
    }
    /**
     * @param bumen 部门
     */
    public void setBumen(BuMen bumen) {
        this.bumen = bumen;
    }
    
    
    private ZhiWu zhiwu;	//职务
    /**
     * @return zhiwu 职务
     */
    @ManyToOne
    @JoinColumn(name="ZWNO", referencedColumnName="ZWNO", insertable=false, updatable=false)
    @NotFound(action=NotFoundAction.IGNORE)
    public ZhiWu getZhiwu() {
        return zhiwu;
    }
    /**
     * @param zhiwu 职务
     */
    public void setZhiwu(ZhiWu zhiwu) {
        this.zhiwu = zhiwu;
    }
}
