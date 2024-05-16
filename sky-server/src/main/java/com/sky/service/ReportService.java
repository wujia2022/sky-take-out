package com.sky.service;

import com.sky.vo.TurnoverReportVO;

import java.time.LocalDate;

/**
 * ClassName: ReportService
 * Package: com.sky.service
 * Description:
 *
 * @Author: 吴佳
 * @Create: 2024/5/16 - 16:46
 * @Version: v1.0
 */
public interface ReportService {
    /**
     * 统计指定时间内的营业额数据
     * @param begin
     * @param end
     * @return
     */
    TurnoverReportVO getTurnoverStatistics(LocalDate begin, LocalDate end);
}