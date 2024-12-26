package LLD.prototype;

public class IntelligentStudent extends Student {
    private int iq;

    @Override
    public IntelligentStudent clone() {
        IntelligentStudent inst = new IntelligentStudent();
        inst.setAge(this.getAge());
        inst.setAvgBatchPsp(this.getAvgBatchPsp());
        inst.setName(this.getName());
        inst.setBatch(this.getBatch());
        inst.setPsp(this.getPsp());

        inst.iq = this.iq;
        return inst;
    }
}
