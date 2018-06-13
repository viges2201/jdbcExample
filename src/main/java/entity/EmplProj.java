package entity;

public class EmplProj {
    private long projectId;
    private long empployeeId;

    public EmplProj() {
    }

    @Override
    public String toString() {
        return "EmplProj{" +
                "projectId=" + projectId +
                ", empployeeId=" + empployeeId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmplProj emplProj = (EmplProj) o;

        if (projectId != emplProj.projectId) return false;
        return empployeeId == emplProj.empployeeId;
    }

    @Override
    public int hashCode() {
        int result = (int) (projectId ^ (projectId >>> 32));
        result = 31 * result + (int) (empployeeId ^ (empployeeId >>> 32));
        return result;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public long getEmpployeeId() {
        return empployeeId;
    }

    public void setEmpployeeId(long empployeeId) {
        this.empployeeId = empployeeId;
    }
}
