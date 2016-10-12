package com.song.sunset.beans;

import java.util.List;

/**
 * Created by Song on 2016/9/20 0020.
 * Email:z53520@qq.com
 */
public class ComicDetailBean {

    private ComicBean comic;

    private List<ChapterListBean> chapter_list;

    private List<OtherWorksBean> otherWorks;

    public ComicBean getComic() {
        return comic;
    }

    public void setComic(ComicBean comic) {
        this.comic = comic;
    }

    public List<ChapterListBean> getChapter_list() {
        return chapter_list;
    }

    public void setChapter_list(List<ChapterListBean> chapter_list) {
        this.chapter_list = chapter_list;
    }

    public List<OtherWorksBean> getOtherWorks() {
        return otherWorks;
    }

    public void setOtherWorks(List<OtherWorksBean> otherWorks) {
        this.otherWorks = otherWorks;
    }

    public static class ComicBean {
        private String name;
        private String comic_id;
        private String short_description;
        private int accredit;
        private String cover;
        private String is_vip;
        private String type;
        private String ori;
        private int series_status;
        private int last_update_time;
        private String description;
        private String cate_id;
        private String week_more;
        private String thread_id;
        private String last_update_week;
        private AuthorBean author;
        private List<String> theme_ids;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getComic_id() {
            return comic_id;
        }

        public void setComic_id(String comic_id) {
            this.comic_id = comic_id;
        }

        public String getShort_description() {
            return short_description;
        }

        public void setShort_description(String short_description) {
            this.short_description = short_description;
        }

        public int getAccredit() {
            return accredit;
        }

        public void setAccredit(int accredit) {
            this.accredit = accredit;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getIs_vip() {
            return is_vip;
        }

        public void setIs_vip(String is_vip) {
            this.is_vip = is_vip;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getOri() {
            return ori;
        }

        public void setOri(String ori) {
            this.ori = ori;
        }

        public int getSeries_status() {
            return series_status;
        }

        public void setSeries_status(int series_status) {
            this.series_status = series_status;
        }

        public int getLast_update_time() {
            return last_update_time;
        }

        public void setLast_update_time(int last_update_time) {
            this.last_update_time = last_update_time;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCate_id() {
            return cate_id;
        }

        public void setCate_id(String cate_id) {
            this.cate_id = cate_id;
        }

        public String getWeek_more() {
            return week_more;
        }

        public void setWeek_more(String week_more) {
            this.week_more = week_more;
        }

        public String getThread_id() {
            return thread_id;
        }

        public void setThread_id(String thread_id) {
            this.thread_id = thread_id;
        }

        public String getLast_update_week() {
            return last_update_week;
        }

        public void setLast_update_week(String last_update_week) {
            this.last_update_week = last_update_week;
        }

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public List<String> getTheme_ids() {
            return theme_ids;
        }

        public void setTheme_ids(List<String> theme_ids) {
            this.theme_ids = theme_ids;
        }

        public static class AuthorBean {
            private String avatar;
            private String name;
            private String id;

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }
    }

    public static class ChapterListBean {
        private String name;
        private String image_total;
        private String chapter_id;
        private String type;
        private String price;
        private String size;
        private int pass_time;
        private String release_time;
        private String zip_high_webp;
        private int is_new;
        private boolean has_locked_image;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage_total() {
            return image_total;
        }

        public void setImage_total(String image_total) {
            this.image_total = image_total;
        }

        public String getChapter_id() {
            return chapter_id;
        }

        public void setChapter_id(String chapter_id) {
            this.chapter_id = chapter_id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public int getPass_time() {
            return pass_time;
        }

        public void setPass_time(int pass_time) {
            this.pass_time = pass_time;
        }

        public String getRelease_time() {
            return release_time;
        }

        public void setRelease_time(String release_time) {
            this.release_time = release_time;
        }

        public String getZip_high_webp() {
            return zip_high_webp;
        }

        public void setZip_high_webp(String zip_high_webp) {
            this.zip_high_webp = zip_high_webp;
        }

        public int getIs_new() {
            return is_new;
        }

        public void setIs_new(int is_new) {
            this.is_new = is_new;
        }

        public boolean isHas_locked_image() {
            return has_locked_image;
        }

        public void setHas_locked_image(boolean has_locked_image) {
            this.has_locked_image = has_locked_image;
        }
    }

    public static class OtherWorksBean {
        private String comicId;
        private String coverUrl;
        private String name;
        private String passChapterNum;

        public String getComicId() {
            return comicId;
        }

        public void setComicId(String comicId) {
            this.comicId = comicId;
        }

        public String getCoverUrl() {
            return coverUrl;
        }

        public void setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassChapterNum() {
            return passChapterNum;
        }

        public void setPassChapterNum(String passChapterNum) {
            this.passChapterNum = passChapterNum;
        }

        @Override
        public String toString() {
            return "OtherWorksBean{" +
                    "comicId='" + comicId + '\'' +
                    ", coverUrl='" + coverUrl + '\'' +
                    ", name='" + name + '\'' +
                    ", passChapterNum='" + passChapterNum + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ReturnDataBean{" +
                "comic=" + comic +
                ", chapter_list=" + chapter_list +
                ", otherWorks=" + otherWorks +
                '}';
    }
}
