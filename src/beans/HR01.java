package beans;



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.validator.Length;



/**
 * 部门岗位资料
 * 
 * @author hs
 * 
 * @version 20180910 created
 *
 */
@Entity
@Table(name = "HR01")
public class HR01 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8403093310098971961L;
	
	
	
	private String dept;
	private String name;
	private String pdept;
	
	private Set<HR02> hr02s = new HashSet<HR02>();
	
	/**
	 * 部门岗位对应的班别
	 * 
	 * @return
	 */
	@OneToMany
	@JoinColumn(name="DEPT", referencedColumnName="DEPT", insertable=false, updatable=false)
    @NotFound(action=NotFoundAction.IGNORE)
	public Set<HR02> getHr02s() {
		return hr02s;
	}
	public void setHr02s(Set<HR02> hr02s) {
		this.hr02s = hr02s;
	}
	
	
	
	
	
	public HR01() {
		super();
	}
	
	
	/**
	 * 部门代号
	 * 
	 * @return the dept
	 */
	@Id
    //@Column(name = "DEPT", columnDefinition="comment='部门代号'")
	@Column(name = "DEPT")
	@Length(max=30)
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	/**
	 * 部门名称
	 * 
	 * @return the name
	 */
	@Column(name = "NAME")
	@Length(max=100)
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * 上级部门代号
	 * 
	 * @return the pdept
	 */
	@Column(name = "PDEPT")
	@JoinColumn()
	@Length(max=30)
	public String getPdept() {
		return pdept;
	}
	/**
	 * @param pdept the pdept to set
	 */
	public void setPdept(String pdept) {
		this.pdept = pdept;
	}
	
	
	
	
}
