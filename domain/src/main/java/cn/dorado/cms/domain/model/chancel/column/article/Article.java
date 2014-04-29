package cn.dorado.cms.domain.model.chancel.column.article;

import cn.dorado.cms.domain.AbstractEntity;
import cn.dorado.cms.domain.DomainId;
import cn.dorado.cms.domain.model.chancel.column.Column;
import cn.dorado.cms.domain.model.common.Author;
import cn.dorado.cms.domain.model.common.SmartDate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eric on 14-4-29.
 */
public class Article extends AbstractEntity{
    DomainId articleId;
    String title;
    String content;
    SmartDate createDate;
    Author author;
    int publishState;
    int approvalState;
    int privateState;
    int commentScope;
    Set<Column> columns =new HashSet<Column>();
    Set<Tag> tags=new HashSet<Tag>();
    Set<Comment> comments=new HashSet<Comment>();

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createDate=" + createDate +
                ", author=" + author +
                ", publishState=" + publishState +
                ", approvalState=" + approvalState +
                ", privateState=" + privateState +
                ", commentScope=" + commentScope +
                ", columns=" + columns +
                ", tags=" + tags +
                ", comments=" + comments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (!articleId.equals(article.articleId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return articleId.hashCode();
    }

    public DomainId getArticleId() {
        return articleId;
    }

    public void setArticleId(DomainId articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public SmartDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(SmartDate createDate) {
        this.createDate = createDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublishState() {
        return publishState;
    }

    public void setPublishState(int publishState) {
        this.publishState = publishState;
    }

    public int getApprovalState() {
        return approvalState;
    }

    public void setApprovalState(int approvalState) {
        this.approvalState = approvalState;
    }

    public int getPrivateState() {
        return privateState;
    }

    public void setPrivateState(int privateState) {
        this.privateState = privateState;
    }

    public int getCommentScope() {
        return commentScope;
    }

    public void setCommentScope(int commentScope) {
        this.commentScope = commentScope;
    }

    public Set<Column> getColumns() {
        return columns;
    }

    public void setColumns(Set<Column> columns) {
        this.columns = columns;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    /**
     * 发布文章的方法
     */
    public void publish(){
       //todo:
    }

    /**
     * 将文章保存为草稿
     */
    public void saveAsDraft(){

    }

    /**
     * 撤销发布的文章
     */
    public void withDraw(){

    }

    /**
     * 删除文章的方法
     */
    public void destory(){

    }

    /**
     * 删除到回收站
     */
    public void moveToRecycle(){

    }
    /**
     * 关闭评论
     */
    public void disableComment(){

    }

    /**
     * 运行匿名评论
     */
    public void allowCommentByAnonymous(){

    }

    /**
     * 只运行注册用户评论
     */
    public void allowCommentByRegister(){

    }

    /**
     * 添加所属栏目
     * @param column 所属栏目
     */
    public void addColumn(Column column){

    }

    /**
     * 添加标签
     * @param tag 包含的标签
     */
    public void addTag(Tag tag){

    }


}
