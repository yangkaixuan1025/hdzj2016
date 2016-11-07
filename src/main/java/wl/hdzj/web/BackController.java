package wl.hdzj.web;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import wl.hdzj.service.MessageVO;
import wl.hdzj.service.NewsVO;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 *  后台相关控制层
 *  @author lipengbiao
 */
@Controller
public class BackController {

    /** 新闻添加 API
     * @param file 上传的新闻图片
     * @param newsVO 新闻传参
     * @param request ~
     * @return 服务反馈
     */
    @RequestMapping(value = "/admin/news/ADD", method = RequestMethod.POST)
    @ResponseBody
    public MessageVO addnews(MultipartFile file, NewsVO newsVO, HttpServletRequest request){
        try {
            String path = "";
            if (!file.isEmpty()){
                path = request.getSession().getServletContext().getRealPath("upload");
                int random = (int) (Math.random() * 10000);
                String newFileName = file.getOriginalFilename() + Long.toString(System.currentTimeMillis()) + random ;
                FileUtils.writeByteArrayToFile(new File(path, newFileName), file.getBytes());
            }
            newsVO.save(path);
            return new MessageVO(0, "添加成功", "");
        } catch (Exception e){
            return new MessageVO(1, "添加失败", e.getMessage());
        }
    }
}
