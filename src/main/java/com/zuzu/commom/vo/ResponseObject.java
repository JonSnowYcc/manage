package com.zuzu.commom.vo;
import com.zuzu.sys.entity.Incident;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class ResponseObject implements Serializable {

        /**
         * 响应码
         */
        private String respCode;
        /**
         * 响应信息
         */
        private String respMessage;
        /**
         * 响应数据
         */
        private Object data;



        /**
         * toString
         *
         * @return
         */
        @Override
        public String toString() {
            return "OutputObject{" +
                    "respCode='" + respCode + '\'' +
                    ", respMessage='" + respMessage + '\'' +
                    ", data=" + data +
                    '}';
        }
    }
