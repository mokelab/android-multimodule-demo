package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data851RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data852RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data853RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data854RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data855RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data856RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data857RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data858RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data859RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data860RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen086ViewModel @Inject constructor(
    private val repo1: Data851RepositoryImpl,
    private val repo2: Data852RepositoryImpl,
    private val repo3: Data853RepositoryImpl,
    private val repo4: Data854RepositoryImpl,
    private val repo5: Data855RepositoryImpl,
    private val repo6: Data856RepositoryImpl,
    private val repo7: Data857RepositoryImpl,
    private val repo8: Data858RepositoryImpl,
    private val repo9: Data859RepositoryImpl,
    private val repo10: Data860RepositoryImpl,

): ViewModel() {
}
