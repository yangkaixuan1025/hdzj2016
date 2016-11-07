package wl.hdzj.service;

import org.springframework.beans.factory.annotation.Autowired;
import wl.hdzj.domain.ColumnRepository;
import wl.hdzj.domain.NewsRepository;
import wl.hdzj.domain.TeamRepository;
import wl.hdzj.entity.Column;
import wl.hdzj.entity.News;
import wl.hdzj.entity.Team;

public class NewsVO {
    private int cid = -1;
    private int tid = -1;
    private String title;
    private String subtitle;
    private String message;
    private String auther;
    private short type = -1;
    private short isdraft = 0;
    private short istop = 0;

    @Autowired NewsRepository newsRepository;
    @Autowired ColumnRepository columnRepository;
    @Autowired TeamRepository teamRepository;

    public NewsVO() {
        super();
    }

    /**传参对象持久化
     * @param pic 图片路径（非custom暴露参数）
     * @return 是否成功
     */
    public boolean save(String pic){
        if (!(title.isEmpty() || subtitle.isEmpty() || message.isEmpty() || auther.isEmpty()
        || type == -1)){ // 必填项不能为空
            News rnews = newsRepository.save(new News(auther, null, isdraft, istop, message, pic, subtitle, title, type,
                    cid != -1 ? columnRepository.findOne(cid) : null,
                    tid != -1 ? teamRepository.findOne(tid) : null));
            return rnews.getNid() != 0;
        } else {
            return false;
        }
    }

    public short getIsdraft() {
        return isdraft;
    }

    public void setIsdraft(short isdraft) {
        this.isdraft = isdraft;
    }

    public short getIstop() {
        return istop;
    }

    public void setIstop(short istop) {
        this.istop = istop;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }
}
