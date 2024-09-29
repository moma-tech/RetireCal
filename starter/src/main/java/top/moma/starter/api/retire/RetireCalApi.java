package top.moma.starter.api.retire;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/retire")
public class RetireCalApi {

  @GetMapping("/cal/{sex}/{type}/{birthday}/")
  public String calRetireYear(
      @PathVariable("sex") String sex,
      @PathVariable("type") String type,
      @PathVariable("birthday") String birthday) {
    return "Result:";
  }
}
