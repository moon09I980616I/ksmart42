var gulp = require('gulp');
var sass = require('gulp-sass');
var browserSync = require('browser-sync').create();

sass.compiler = require('node-sass');

// Static Server
gulp.task('serve', function(done) {
    browserSync.init({
        server: "template/"
    });
    done();
});

gulp.task('css', function () {
  return gulp.src('template/scss/**/*.scss')
    .pipe(sass().on('error', sass.logError))
    .pipe(gulp.dest('template/css')).pipe(browserSync.stream());
});

// watching scss/assets files
gulp.task('watch', function(done) {
  gulp.watch(['template/scss/**/*.scss'], gulp.series('css'));
  gulp.watch("template/*.template").on('change', browserSync.reload);
done();
});

gulp.task( 'default', gulp.series( 'css', gulp.parallel('serve', 'watch')));