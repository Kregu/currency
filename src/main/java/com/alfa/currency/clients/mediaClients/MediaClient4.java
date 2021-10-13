package com.alfa.currency.clients.mediaClients;

import com.alfa.currency.clients.DownloadingGifInterface;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "media4", url = "${mediaUrl4}", qualifier = "media4")
public interface MediaClient4 extends DownloadingGifInterface {
}
